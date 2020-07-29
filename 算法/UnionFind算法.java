package 算法;

public class UnionFind算法 {

    private int[] id;
    private int count;

    public UnionFind算法(int N){
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public int count(){
        return count;
    }

    /*quick-find算法
    public int find(int p){
        return id[p];
    }

    public void union(int p,int q){
        int pID = find(p);
        int qID = find(q);
        if(pID == qID)
            return;
        for (int i = 0; i < id.length; i++) {
            if(id[i] == pID)
                id[i] = qID;
             count--;
             }
        }
     */

    /*quick-union算法
    private int find(int p){
        while (p != id[p])
            p = id[p];
        return p
    }

    public void union(int p,int q){
        int pRoot = find(p);
        int qRoot = find(q);
        if (pRoot == qRoot)
            return;
        id[pRoot] = qRoot;
        count--;
        }
    */

    }

