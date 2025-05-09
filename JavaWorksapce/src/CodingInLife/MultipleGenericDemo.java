package CodingInLife;

class MEmployeeInfo{
    public int rank;
    MEmployeeInfo(int rank){ this.rank = rank; }

    public String toString() {
        return String.format("Employee(rank: %d)", this.rank);
    }
}
class MPerson<T, S>{
    public T info;
    public S id;
    MPerson(T info, S id){
        this.info = info;
        this.id = id;
    }
    public <U> void printInfo(U info) {
        System.out.println(info);
    }
}

public class MultipleGenericDemo {
    public static void main(String[] args) {
        MEmployeeInfo e1 = new MEmployeeInfo(1);
        MPerson<MEmployeeInfo, Integer> p1 = new MPerson<MEmployeeInfo, Integer>(e1, 1);
        System.out.println("info: " + p1.info);
        System.out.println("id: " + p1.id);
        System.out.println("rank: " + p1.info.rank);
        p1.<MEmployeeInfo>printInfo(e1);
    }
}
