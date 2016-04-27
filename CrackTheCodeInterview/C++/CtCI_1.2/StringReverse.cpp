/*
Implement a function void reverse(char* str) in C or C++ 
which reverses a null-terminated string.
To compile: g++ StringReverse.cpp -o rev
*/

#include <string.h>
#include <iostream>

using namespace std;

void reverse(char s[]) {
	int length = strlen(s);
	int i, j;
	char c;
	
	for (i = 0, j = length - 1; i < j; i++, j--) {
		c = s[i];
		s[i] = s[j];
		s[j] = c;
	}
	
	cout << s << endl;
}

int main() {
	char s[] = "backwards";

	cout << s << endl;
	
	reverse(s);
}
