#include<iostream>
using namespace std;
int main()
{
	int data[7]={0};
	cout<<"Enter Data Bits\n";
	cin>>data[6]>>data[5]>>data[4]>>data[2];
	data[0]=data[0]^data[2]^data[4]^data[6];
	data[1]=data[1]^data[2]^data[5]^data[6];
	data[3]=data[3]^data[4]^data[5]^data[6];
	for(int i=6;i>=0;i--)
	cout<<data[i]<<" ";
	cout<<endl;
	
	cout<<"Enter Recieved Data \n";
	int dat[7]={0};
	for(int i=6;i>=0;i--)
	cin>>dat[i];
	int c1,c2,c3;
	c1=dat[0]^dat[2]^dat[4]^dat[6];
	c2=dat[1]^dat[2]^dat[5]^dat[6];
	c3=dat[3]^dat[4]^dat[5]^dat[6];
	int c=4*c3+2*c2+c1;
	if(c==0)
	{
		cout<<"No Error";
		cout<<endl<<"Recieved data is : ";
		for(int i=6;i>=0;i--)
		cout<<dat[i]<<" ";
		cout<<endl<<"Correct data is : ";
		for(int i=6;i>=0;i--)
		cout<<data[i]<<" ";
	}
	else
	{
		cout<<"There is a Error at Bit "<<c-1;
		cout<<endl<<"Recieved data is : ";
		for(int i=6;i>=0;i--)
		cout<<dat[i]<<" ";
		if(dat[c-1]==0)
		dat[c-1]=1;
		else
		dat[c-1]=0;
		cout<<endl<<"Correct data is : ";
		for(int i=6;i>=0;i--)
		cout<<data[i]<<" ";
	}
	return 0;
}
