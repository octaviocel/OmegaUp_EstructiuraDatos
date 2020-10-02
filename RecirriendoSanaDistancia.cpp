#include <iostream>

using namespace std;

int main()
{
    unsigned int x;
    std::cin >> x;
    if(x==1) {
			std::cout<<1;
		}else {
		unsigned int acu= x, fin=x+1;
		while(x!=0) {
			acu=acu*(x-1);
			fin=fin+acu;
			x--;
		}
		std::cout<<fin;
		}

}
