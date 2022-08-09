package CodeForces_B;

import java.util.*;

public class BurgerMatches {
    static class Container {
        int size;
        int num;

        public Container(int size, int num) {
            this.size = size;
            this.num = num;
        }

        public int getSize() {
            return size;
        }

        public int getNum() {
            return num;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stealBoxes = scanner.nextInt();
        int numContainers = scanner.nextInt();
        ArrayList<Container> containers = new ArrayList<>();
        for (int i = 0; i < numContainers; i++) {
            int num = scanner.nextInt();
            int size = scanner.nextInt();
            containers.add(new Container(size, num));
        }
        Collections.sort(containers, new Comparator<Container>() {
            @Override
            public int compare(Container o1, Container o2) {
                return o1.getSize() - o2.getSize();
            }
        });
        int totalMatches = 0;
        while (stealBoxes > 0) {
            if (containers.size() == 0) {
                break;
            }
            Container container = containers.get(containers.size() - 1);
            if (stealBoxes - container.num >= 0) {
                totalMatches += container.getSize() * container.getNum();
                stealBoxes -= container.getNum();
            } else {
                totalMatches += container.getSize() * stealBoxes;
                stealBoxes = 0;
            }
            containers.remove(containers.size() - 1);
        }
        System.out.println(totalMatches);
    }
}

