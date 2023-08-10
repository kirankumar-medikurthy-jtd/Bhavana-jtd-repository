class stackInJava {
    public static Node Push(int data,Node top){
        Node temp = new Node();
        temp.data=data;
        temp.next=top;
        top = temp;

        return top;
    }
    public static void printStack(Node top){
        Node travese = top;
        while(travese != null){
            System.out.print(travese.data);
            System.out.print("->");
            travese = travese.next;
        }
        System.out.println("");

    }
    public static Node Pop(Node top){
        if(top != null){
            top = top.next;
        }
        
        return top;
    }
    public static void main(String[] args){
        Node top = null;
         for(int i = 0 ; i < 10 ; i++){
            top = Push( i , top);
            printStack(top);
         }

        top = Pop(top);
        printStack(top);
    }
}
