#define ll long long int
class Solution {
public:
    int myAtoi(string s) {
        
        ll ans=0;
        ll t=1;                       // gives the sign of answer
        ll i=0;                        //to iterate given string
        
        for(;i<s.size();i++)            //skip all starting spaces
        {if(s[i]!=' ') break;}
        
        if(s[i]=='-'){                  //1st char after space can be sign -ive
            t*=-1;                      //multiplier becomes -ive
            i++;                        //now go to next char
        }
        else if(s[i]=='+')              
            i++;
       
       // spaces checked -> sign checked ->now just chk for numbers
        for(;i<s.size();i++)
        {
            if(0<=(s[i]-'0') and (s[i]-'0')<=9){    //chk for no.
                 //cant perform ans=ans*10 + s[i]-'0' in one step due to overflow so
                 //first do:
                 ans=ans*10;                         
                 //chk if ans is within limit
                  
                  if( ans*t<INT_MIN)
                  return INT_MIN;
                  if(ans*t> INT_MAX)
                  return INT_MAX;
                  
                 //second do:
                  ans+=s[i]-'0';
                 //chk if ans within limit
                 
                if( ans*t<INT_MIN)
                return INT_MIN;
                if(ans*t> INT_MAX)
                return INT_MAX;
            }
            else                    //this loop only chks for numbers, anything valid was already read so,
                break;
        }
        
        ans=t*ans;                  //real ans ie ans with sign
       
       if(ans==0)
            return 0;
        if( ans<INT_MIN)
            return INT_MIN;
        if(ans> INT_MAX)
            return INT_MAX;
        
        int a=ans;
        return a;
    }
};
