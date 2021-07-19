package lesson5;

import java.util.*;

public class BackPack {
    private final int maxWeightBag;
    private int maxFindCost = 0;
    private ArrayList<int[]> st = new ArrayList<>();

    public BackPack(int maxWeightBag) {
        this.maxWeightBag = maxWeightBag;
    }

    public void getAnswerItems() {
        for (int i = 0; i < st.size(); i++) {
            System.out.println(Arrays.toString(st.get(i)));
        }
    }

    public int getAnswerFindCost() {
        return maxFindCost;
    }

    private void setSt(ArrayList<int[]> st) {

        this.st = (ArrayList<int[]>)st.clone();
    }

    public void getOneLineTree(ArrayList<int[]> stackIn, ArrayList<int[]> stackOut, int totalWeight, int totalCost) {
        //System.out.println(stackIn + " " + stackOut + " " + st);
        int[] list = stackIn.get(0);
        stackIn.remove(0);
        int newWeightBagPerStep = list[0] + totalWeight;
        int newCostBagPerStep = list[1] + totalCost;

        if (stackIn.size() == 0) {
            if (maxWeightBag > newWeightBagPerStep && maxFindCost < newCostBagPerStep) {
                stackOut.add(list);
                maxFindCost = newCostBagPerStep;
                setSt(stackOut);

            } else if (maxWeightBag > totalWeight && maxFindCost < totalCost) {
                maxFindCost = totalCost;
                setSt(stackOut);
            }

            stackOut.clear();
            return;
        }

        for (int i = 0; i < stackIn.size(); i++) {
            getOneLineTree(new ArrayList<>(stackIn.subList(i, stackIn.size())), stackOut, totalWeight, totalCost);
        }

        if (maxWeightBag > newWeightBagPerStep) {
            stackOut.add(list);
            for (int i = 0; i < stackIn.size(); i++) {
                getOneLineTree(new ArrayList<>(stackIn.subList(i, stackIn.size())), stackOut, newWeightBagPerStep, newCostBagPerStep);
            }
        }

    }

}
