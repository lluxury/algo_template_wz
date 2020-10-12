#include<iostream>
#include "find.h"

using namespace std;

int main()
{
  char a[]={"4,2,3,5,9,6"};
  int n=6;
  char key = 6;
    std::cout << find(a,n,key);
}


// 无脑的引入其他知识是灾难, 花了这么多时候, 只是消灭了语法错误
// 逻辑错误还在
