class MedianFinder {
    PriorityQueue<Integer> lesserVals = new PriorityQueue<>((a, b) -> b - a);
    PriorityQueue<Integer> greaterVals;
    int streamLen = 0;
    public MedianFinder() {
        lesserVals = new PriorityQueue<>((a, b) -> b - a);
        greaterVals = new PriorityQueue<>();
    }
    public void addNum(int num) {
        if(streamLen % 2 == 0) {
            lesserVals.offer(num);
            greaterVals.offer(lesserVals.poll());
        }
        else {
            greaterVals.offer(num);
            lesserVals.offer(greaterVals.poll());
        }
        streamLen++;
    }
    public double findMedian() {
        return streamLen % 2 == 0 ? 0.50 * (lesserVals.peek() + greaterVals.peek()) : greaterVals.peek();
    }
}
/*
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */