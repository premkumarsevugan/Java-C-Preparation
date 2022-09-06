#include <stdio.h>
#include <stdlib.h>
int main(){
    struct node{
        int data;
        struct node *prev;
        struct node *next;
    };
    struct node* head=NULL;
    struct node* second=NULL;
    struct node* third=NULL;
    struct node* temp=NULL;
    struct node* ptr;
    struct node* tptr;
    head = (struct node*)malloc(sizeof(struct node));
    second = (struct node*)malloc(sizeof(struct node));
    third = (struct node*)malloc(sizeof(struct node));
    temp = (struct node*)malloc(sizeof(struct node));
    head->prev=NULL;
    head->data=10;
    head->next=second;
    second->prev=head;
    second->data=20;
    second->next=third;
    third->prev=second;
    third->data=30;
    third->next=NULL;
    printf("Enter the elemnt to insert at end:");
    scanf("%d",&temp->data);
    tptr=head;

    while(tptr->next!=NULL){
        tptr=tptr->next;

    }
    tptr->next=temp;
    temp->prev=tptr;
    // printf("%d ",tptr->data);
    ptr=head;
    
    while(ptr!=NULL){
        printf("%d ",ptr->data);
        ptr=ptr->next;

    }
    
    return 0;
    
}