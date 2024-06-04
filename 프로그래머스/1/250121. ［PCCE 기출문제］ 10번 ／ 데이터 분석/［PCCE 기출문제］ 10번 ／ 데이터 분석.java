import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> res = new ArrayList<>();

        for (int[] da : data) {
            if (ext.equals("code")) {
                if (da[0] < val_ext) {
                    res.add(da);
                }
            } else if (ext.equals("date")) {
                if (da[1] < val_ext) {
                    res.add(da);
                }
            } else if (ext.equals("maximum")) {
                if (da[2] < val_ext) {
                    res.add(da);
                }
            } else if (ext.equals("remain")) {
                if (da[3] < val_ext) {
                    res.add(da);
                }
            }
        }

        if (sort_by.equals("code")) {
            res.sort((d1, d2) -> d1[0] - d2[0]);
        } else if (sort_by.equals("date")) {
            res.sort((d1, d2) -> d1[1] - d2[1]);
        } else if (sort_by.equals("maximum")) {
            res.sort((d1, d2) -> d1[2] - d2[2]);
        } else if (sort_by.equals("remain")) {
            res.sort((d1, d2) -> d1[3] - d2[3]);
        }


        int[][] answer = new int[res.size()][data[0].length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = res.get(i);
        }

        return answer;
    }
}