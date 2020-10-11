#include<bits/stdc++.h>
using namespace std;
long long gcd(long long a, long long b)
{
  if(b==0)
  return a;
  long long c = a%b;
  return gcd(b,c);
}
long long lcm(long long a, long long b)
{
  long long lc = (a*b)/gcd(a,b);
  return lc;
}
int main()
{
  long long a,b;
  cin>>a>>b;
  long long c = lcm(a,b);
  cout<<c;
  return 0;
}
