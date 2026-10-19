class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for(int i:stones){
            queue.offer(i);
        }
        while(queue.size()>1){
           int first = queue.poll();
           int second = queue.poll();

           if(first>second){
              queue.offer(first-second);
           }
        }
       return queue.isEmpty()? 0 : queue.peek(); 
    }
}
