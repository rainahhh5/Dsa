#include<bits/stdc++.h>
using namespace std;


//parameterised way Sum of Nuber using recurssion

// void print(int i,int sum){

//     if(i<0){
//         cout<<sum;
//         return;
//     }   
//     print(i-1,sum+i);        
// }

// int main() {
    
//     int n,i;
//     cin >> n;
//     print(n,0);

    
// }

int print(int n){

    if(n==0){
    return 0;
    }   
    
    return n+print(n-1) ;  
    
}

int main() {
    
    int n,i;
    cin >> n;
    cout<<print(n);

}  
