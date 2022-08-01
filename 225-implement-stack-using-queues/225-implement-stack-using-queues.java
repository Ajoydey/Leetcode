class MyStack {
    
    /*
    Queue<Integer> q1, q2;
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        if(!q1.isEmpty())
            q1.offer(x);
        else
            q2.offer(x);
    }
    
    public int pop() {
        if(!q1.isEmpty())
        {
            while(q1.size() != 1)
                q2.offer(q1.poll());
            
            return q1.poll();
        }
        
        else
        {
            while(q2.size() != 1)
                q1.offer(q2.poll());
            
            return q2.poll();
        }
    }
    
    public int top() {
        int peek = Integer.MAX_VALUE;
        if(!q1.isEmpty())
        {
            while(!q1.isEmpty()){
                if(q1.size()==1)
                    peek = q1.peek();
                q2.offer(q1.poll());
            }
            
        }
        
        else
        {
            while(!q2.isEmpty()){
                if(q2.size()==1)
                    peek = q2.peek();
                q1.offer(q2.poll());
            }
        }
        return peek;
    }
    
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
    */
    
    //chumu solution
    
    Queue<Integer> q1;
    public MyStack() {
        q1 = new LinkedList<>();
    }
    
    public void push(int x) {
        int size = q1.size();
        q1.offer(x);
        while(size-- !=0){
            q1.offer(q1.peek());
            q1.poll();
        }
    }
    
    public int pop() {
        return q1.poll();
    }
    
    public int top() {
        return q1.peek();
    }
    public boolean empty(){
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */