/*
*      12   =a
*    X 11   =b
*      12   =ans
*     12x   offset=1 
*     132
*/
typedef long long int ll;
class Solution {
public:
 string multiply(string a,string b)
 {
 
  //trivial case
  string z="0"; 
	if(a==z or b==z)
        return z;         
    
    
    if(a<b)
        swap (a,b);                       //so that smaller is b
    string ans(a.size(),'0');             // to store ans

    reverse(a.begin(),a.end());           //reverse so that multiplication is easy
    reverse(b.begin(),b.end());
    ll ls=0;                               // this gives the offset which occurs during multiply
    int c=0;                               //carry during calulations
    for(int i=0;i<b.size();i++)
    {
        ll l=ls;                            // l for traversing ans from ls ,ie the offset and from the begin
        ll ee=b[i]-'0';                    //save beee temporarily

        for(int j=0;j<a.size();j++)
        {
            ll e=a[j]-'0';            //save ae temporarily
            ll temp =e*ee + c;        // multiply ae* bee add carry

            if(l<ans.size())
            {                          // if l exists in string 'ans' add to ans[0]
              temp+=ans[l]-'0';
                ans[l++]=temp%10 + '0';
            }
            else                      //create ans[l] cauz it doesnt exists
            {
                ans.push_back(temp%10 + '0');
                c=temp/10;
            }

        }
        if(c)                       //if carry remains create insert it
        {
           ans.push_back(c+ '0');
           c=0;
        }
       ls++; //the offset increases

    }
    reverse(ans.begin(),ans.end());     //ans was obtained in reverse, so unreverse it
    return ans;
 }
};
