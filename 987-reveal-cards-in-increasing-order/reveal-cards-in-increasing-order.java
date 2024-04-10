class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Queue<Integer> queue = new LinkedList<>();
        int[] ans = new int[deck.length];

        for(int i = 0; i < deck.length; i++)queue.add(i);
        int idx = 0;
        while(queue.size() > 1){
            ans[queue.poll()] = deck[idx++];
            queue.add(queue.poll());
        }
        ans[queue.poll()] = deck[idx++];
        return ans;
    }
}