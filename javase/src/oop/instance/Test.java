package oop.instance;

public class Test {
    public static void main(String[] args) {
        //创建一个电影信息展示和查询的小程序
        Movie[] movies = new Movie[7];
        movies[0] = new Movie("大话西游", 1, 20, "周星驰");
        movies[1] = new Movie("西游记", 2, 20, "周星驰");
        movies[2] = new Movie("西游记2", 3, 20, "周星驰");
        movies[3] = new Movie("西游记3", 4, 20, "周星驰");
        movies[4] = new Movie("西游记4", 5, 20, "周星驰");
        movies[5] = new Movie("西游记5", 6, 20, "周星驰");
        movies[6] = new Movie("西游记6", 7, 20, "周星驰");

        //输出所有的电影信息进行展示
        MovieService movieservice = new MovieService();
        movieservice.setMovies(movies);
        movieservice.showmovies();
        System.out.println("========================");

        //通过id查询电影信息
        movieservice.Searchbyid();
    }
}
