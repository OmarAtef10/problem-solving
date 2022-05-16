package LeetCodePt2;

import java.util.ArrayList;
import java.util.Comparator;

class MyCalendar {
    static class Booking {
        int start;
        int end;

        public Booking(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    private ArrayList<Booking> bookings;

    public MyCalendar() {
        bookings = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for (Booking booking : bookings) {
            if (booking.start == start || booking.end == end) {
                return false;
            } else if (start > booking.start && end < booking.end) {
                return false;
            } else if (start < booking.start && end > booking.end) {
                return false;
            }
            else if (start > booking.start && start < booking.end) {
                return false;
            }
            else if (end > booking.start && end < booking.end) {
                return false;
            }
        }
        bookings.add(new Booking(start, end));
        return true;
    }

    public static void main(String[] args) {
        MyCalendar calendar = new MyCalendar();
        calendar.book(37, 50);
        calendar.book(33, 50);
        calendar.book(4, 17);
        calendar.book(35, 48);
        calendar.book(8, 25);


    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */


