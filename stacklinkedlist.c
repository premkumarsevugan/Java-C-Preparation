#include <stdio.h>
#include <stdlib.h>
void push();
void pop();
void display();
struct node {
    int val;
    struct node *next;
};
struct node *head;
void main(){
    int choice=0;
    while(choice!=4){
            printf("Choose one of the option given below:\n");
            printf("1.push 2.pop 3.display 4.exit\n");
            printf("Enter your choice\n");
            scanf("%d",&choice);
            switch(choice){
                case 1:
                {
                    push();
                    break;

                }
                case 2:
                {
                    pop();
                    break;

                }
                case 3:
                {
                    display();
                    break;
                }
                case 4:
                {
                    printf("exiting\n");
                    break;
                }
                default:
                {
                    printf("Enter a valid choice.");
                }
            };
    }
}
void push(){
    int val;
    struct node *ptr=(struct node*)malloc(sizeof(struct node));
    if(ptr==NULL){
        printf("not able to push into that.\n");
    }
    else{
        printf("Enter the value:");
        scanf("%d",&val);
        if(head==NULL){
            ptr->val=val;
            ptr->next=NULL;
            head=ptr;
        }
        else{
            ptr->val=val;
            ptr->next=head;
            head=ptr;

        }
        printf("Itrm pushed successfully.\n");
    }
}
void pop(){
    int item;
    struct node *ptr;
    if(head==NULL){
        printf("Under flow");

    }
    else{
        item=head->val;
        ptr=head;
        head=head->next;
        free(ptr);
        printf("Item poped\n");

    }
}
void display(){
    int i;
    struct node *ptr;
    ptr=head;
    if(ptr==NULL){
        printf("Stack is empty");

    }
    else{
        printf("Stack elements are: ");
        while(ptr!=NULL){
            printf("%d ",ptr->val);
            ptr=ptr->next;
        }
    }
}