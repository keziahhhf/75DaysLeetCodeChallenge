class MyQueue {
    int[] arr;
    int front;
    int rear;
    public MyQueue()
  {
        front=-1;
        rear=-1;
        arr=new int[100];
    }
    
    public void push(int x) {
        if(front==-1)
        front=0;
        rear++;
        arr[rear]=x;
    }
    
    public int pop() {
        

        int val=arr[front];
        front++;
        if(front>rear)
        {
        front=-1;
        rear=-1;
        }
        return val;
    }
    
    public int peek() {
        return arr[front];
    }
    
    public boolean empty() {
        if(front==-1 && rear==-1)
        return true;
        if(front>rear)
        return true;
        return false;

    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */