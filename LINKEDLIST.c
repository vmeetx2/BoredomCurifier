//this one was cool to try

#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};

struct Node* create_node(int value) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = value;
    newNode->next = NULL;
    return newNode;
}

void insert_front(struct Node** head, int value) {
    struct Node* newNode = create_node(value);
    newNode->next = *head;
    *head = newNode;
}

void print_list(struct Node* head) {
    while (head != NULL) {
        printf("%d -> ", head->data);
        head = head->next;
    }
    printf("NULL\n");
}

int main() {
    struct Node* head = NULL;

    insert_front(&head, 10);
    insert_front(&head, 20);
    insert_front(&head, 30);

    print_list(head);

    return 0;
}
