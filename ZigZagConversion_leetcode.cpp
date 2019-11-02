/* observation:

string : ABCDE
numRows: 3
indices of given string are req like this:

0        4
1   3    5
2        6

We just need to to find all the indices at each level for our 'ans'

Pattern:
at level 0:   the offset between indices is 4 (=nr in the code)
so the indices are:   0 , 4= (0+4) or (0+nr)
at level 1: the offset starts from nr-2 (=var_offset in the code)
the offset alternates btw var_offset & nr-var_offset
nr-2 = 2
so the indices are:   1 , 3= (1+2) or (1+var_offset) , 5= (3+2) or (3+(nr-var_offset))
at level 2: (special case for last level) 
the offset again becomes 'nr'
so the indices are:     2, 6= (2+nr) or (2+4)
*/

class Solution {
public:
string convert(string chk, int numRows) {

//trivial cases
if(numRows==0)                                   
return "";
if(numRows==1)
return chk;

int nr=2*(numRows-1);                            
int offset=nr;         

string ans="";

//appending to 'ans' the correct chars of every level 
for(int level=0;level<numRows;level++)
{
	int var_offset=offset;
	int steps=0;
	int i=level;

	while( steps++ < maxCol and i< chk.size() )
	{
		ans.push_back(chk[i]);
		i+=var_offset;
		if(var_offset != nr)
		var_offset=nr-var_offset;
	}

	offset-=2;
	if(offset<=0)
	offset=nr;
}

return ans;

}
};
