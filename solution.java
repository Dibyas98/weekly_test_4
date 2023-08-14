import java.util.*;

class solution{
    public static int sec(int a[]){
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder(null));
        for(int i:a){
            pq.offer(i);
        }
        int second=0;
        while(pq.size()>1){
            int val1=pq.poll();
            int val2=pq.poll();
            if(val1-1>0){
                pq.offer(val1-1);
            }if(val2-1>0){
                pq.offer(val2-1);
            }second++;

        }
        if(pq.peek()%2==0){
            second+=pq.peek()/2;
        }
        else{
            second+=(pq.peek()/2+1);
        }
        // while(pq.peek()>0){
        //     int val=pq.peek();
        //     pq.offer(val-2);
        //     second++;
        // }
        return second;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[3];
        for(int i=0;i<3;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(sec(a));
    }
}