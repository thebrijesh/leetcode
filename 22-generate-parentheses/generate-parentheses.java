class Solution {
  List<String> ans=new ArrayList<String>();
    public void rec(int n,int ob,int cb,StringBuilder s)
    {
        if(ob>n || cb>n)
        {
            return ;
        }
        if(n==ob && ob==cb)
        {
            ans.add(s.toString());
            return ;
        }
        if(ob>cb)
        {
            s.append(")");
            rec(n,ob,cb+1,s);
           s.deleteCharAt(s.length() - 1);
            s.append("(");
            rec(n,ob+1,cb,s);
             s.deleteCharAt(s.length() - 1);
        }
        else
        {
            s.append("(");
            rec(n,ob+1,cb,s);
             s.deleteCharAt(s.length() - 1);
        }
        return ;
    }
    public List<String> generateParenthesis(int n) {
        StringBuilder temp=new StringBuilder();
        rec(n,0,0,temp);
        return ans;
    }
}