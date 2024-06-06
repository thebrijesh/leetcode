class Solution {

    class Card {
        int val;
        int freq;

        public Card(int val, int freq) {
            this.val = val;
            this.freq = freq;
        }
    }

    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0)
            return false;
        if (groupSize == 1)
            return true;

        PriorityQueue<Card> pq = new PriorityQueue<>(new Comparator<>() {
            public int compare(Card c1, Card c2) {
                return Integer.compare(c1.val, c2.val);
            }
        });

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : hand) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            pq.add(new Card(key, map.get(key)));
        }

        System.out.println(map);
        while (!pq.isEmpty()) {
            Card ca = pq.remove();
            ca.freq--;
            Queue<Card> q = new LinkedList<>();
            for(int i = 1; i < groupSize; i++){
                if(!pq.isEmpty() && ca.val + i == pq.peek().val){
                    Card curr = pq.remove();
                    curr.freq -= 1;
                    if(curr.freq >= 1){
                        q.add(curr);
                    }
                }else{
                    return false;
                }
            }

            while(!q.isEmpty()){
                pq.add(q.remove());
            }
            if(ca.freq >= 1){
                        pq.add(ca);
                    }
        }

        return true;
    }
}