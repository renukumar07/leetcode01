//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

class Node{
public:
    int val;
    Node *next;
    Node(int num){
        val=num;
        next=NULL;
    }
};


// } Driver Code Ends
//User function Template for C++

/*

class Node{
public:
    int val;
    Node *next;
    Node(int num){
        val=num;
        next=NULL;
    }
};

*/

class Solution{
public:
    // check whether a number is prime or not
    bool prime(int n)
    {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) 
            if (n % i == 0)
                return false;
        return true;
    }
    // nearest-Prime
    int nearestPrime(int n) {
        if(n == 1) return 2;
        if(prime(n) ) return n;
        
        int left_prime = n ;
        int right_prime = n ;
        while(left_prime>1 && right_prime<(n * n))
        {
            left_prime--;
            if( prime(left_prime) ) return left_prime;
            right_prime++;
            if( prime(right_prime) ) return right_prime;
        }
    }
    
    Node *primeList(Node *head){
        Node* temp = head;
        while(temp) {
            int num = temp->val;
            temp->val = nearestPrime(num); 
            temp = temp->next;
        }
        return head;
    }
};

//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        Node *head,*tail;
        int num;
        cin>>num;
        head=tail=new Node(num);
        for(int i=0;i<n-1;i++){
            int num;
            cin>>num;
            tail->next=new Node(num);
            tail=tail->next;
        }
        Solution ob;
        Node *temp=ob.primeList(head);
        while(temp!=NULL){
            cout<<temp->val<<" ";
            temp=temp->next;
        }
        cout<<endl;
    }
    return 0;
}
// } Driver Code Ends