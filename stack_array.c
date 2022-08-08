#include <stdio.h>
#include <stdlib.h>
int n,arr[100];
int top=0;
void push();
void pop();
void display();
void main(){
        
        int choice=0;
        printf("Enter the array size: ");
        scanf("%d",&n);
        while(choice!=4){
            printf("\nEnter the option Given below:\n");
            printf("\n1.push 2.pop 3.display 4.Exit\n");
            scanf("%d",&choice);
            switch(choice){
                case 1:{
                    push();
                    break;
                }
                case 2:{
                    pop();
                    break;

                }
                case 3:{
                    display();
                    break;
                }
                case 4:{
                    printf("Exiting now....");

                    break;
                }
                default:{
                    break;
                }
            };
        }
}
void push(){
    int val;
    printf("\n Enter the value to push:");
    scanf("%d",&val);
    if(top==n){
        printf("\nthe stack is full");
        
    }
    else{
        top=top+1;
        arr[top]=val;           
    }
}
void pop(){
    if(top==0){
        printf("\nThe stack is empty.\n");
    }
    else{
        top=top-1;

    }
}
void display(){
    int i;
    printf("The elements of the stack are: ");
    for(i=1;i<(top+1);i++){
        printf("%d ",arr[i]);
    }
}