class MinStack {
    ArrayList<Integer> stack;

    public MinStack() {
        stack = new ArrayList<Integer>();
    }

    public void push(int val) {
        stack.add(0, val);
    }

    public void pop() {
        stack.remove(0);
    }

    public int top() {
        return stack.get(0);
    }

    public int getMin() {
        ArrayList<Integer> stackSort = new ArrayList<Integer>(stack);//copy
        Collections.sort(stackSort);
        return stackSort.get(0);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */