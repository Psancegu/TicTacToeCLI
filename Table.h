#ifndef TABLE_H
#define TABLE_H

#include <string>
#include <iostream>

using namespace std;


class Table{
	private:
		char row1[3];
		char row2[3];
		char row3[3];
		string player1;
		string player2;
		char winner;
	public:
		Table(string, string);
		void enterO(char);
		void enterX(char);
		void printTable();
		void checkWinner();
		string returnWinner();
};
#endif		
		

