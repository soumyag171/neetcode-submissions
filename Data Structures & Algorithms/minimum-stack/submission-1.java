class MinStack {
    Stack<Integer> main = new Stack<>();
    Stack<Integer> min = new Stack<>();
    public MinStack() {}

    public void push(int val) {
        main.push(val);
        if(min.isEmpty()){
            min.push(val);
        }
        else{
            min.push(Math.min(val, min.peek()));
        }
        // if (min.isEmpty() || min.peek() >= val) {
        //     min.push(val);
        // }
    }

    public void pop() {
        main.pop();
        min.pop();
        // int i = main.pop();
        // if (i == min.peek())
        //     min.pop();
    }

    public int top() {
        return main.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
