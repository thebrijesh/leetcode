class RecentCounter {

    Queue<Integer> queue = new LinkedList<>();

    public RecentCounter() {
        
    }
    
    public int ping(int t) {
        queue.add(t);
        while(queue.peek()< t - 3000)queue.remove();
        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */