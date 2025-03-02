package Collection.collectiontest;

public class Test {
    public static void main(String[] args) {
        //设计一个电影管理系统，用户可以上架电影、下架电影、查询电影，也可以下架某个主演的所有电影
        movieservice.addmovie();
        movieservice.addmovie();
        movieservice.addmovie();
        movieservice.deletemovie();
        movieservice.searchmovie();
        movieservice.deletemoviebyactor("白敬亭");
    }
}
