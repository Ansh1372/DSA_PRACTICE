package Gready;
import java.util.*;
class meeting {
    int start;
    int end;
    int pos;
     
    meeting(int start, int end, int pos)
    {
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}
class meetingComparator implements Comparator<meeting>
{
    @Override
    public int compare(meeting o1, meeting o2) 
    {
        if (o1.end < o2.end)
            return -1;
        else if (o1.end > o2.end)
            return 1;
        else if(o1.pos < o2.pos)
            return -1;
        return 1; 
    }
}

public class N_Meeting_inAroom {
   public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        ArrayList<meeting> meet = new ArrayList<>();
        int c=0;
        int ifif=0;
        
        for(int i = 0; i < start.length; i++)
            meet.add(new meeting(start[i], end[i], i+1));
        
        meetingComparator mc = new meetingComparator(); 
        Collections.sort(meet, mc); 
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(meet.get(0).pos);
        int limit = meet.get(0).end; 
        
        for(int i = 1;i<start.length;i++) {
            if(meet.get(i).start > limit) {
                limit = meet.get(i).end; 
                answer.add(meet.get(i).pos);
            }
        }
       for(int i = 0;i<answer.size(); i++) {
            c+=answer.get(i);
            ifif++;
        }
        return ifif;
        
    } 
    public static void main(String[] args) {
        System.out.println("Enter the number of people in a room:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Enter the starting time and ending time of each person:");
        int [] start = new int [n];
        int [] end = new int [n];
        for(int i = 0 ; i < n ; i++){
            start[i] = scanner.nextInt();
            end[i] = scanner.nextInt();
        }
        System.out.println("Maximum number of meetings that can be held is "+maxMeetings(start,end,n));
        
    }
}
