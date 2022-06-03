import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("                            ");
        System.out.println("<映画情報の一覧を表示します>");

        MovieList list = new MovieList();
        for (MovieInfo info : list.movieList) {
            System.out.println(info);
        }

        System.out.println("                            ");
        System.out.println("****************************");
        System.out.println("                            ");
        System.out.println("<評価値(Rating)の高い順に表示を並べ替えます>");

        Comparator<MovieInfo> comparator = Comparator.comparing(MovieInfo::getRating).reversed();
        list.movieList.stream().sorted(comparator).forEach(movieInfo -> System.out.println(movieInfo));

        System.out.println("                            ");
        System.out.println("****************************");
        System.out.println("                            ");
        System.out.println("<評価値(Rating)0~2を入力し、条件に合う映画情報を表示します>");
        System.out.println("検索したい映画の評価値(Rating)を0~2の値で入力してください");

        try {
            int inputRating = new Scanner(System.in).nextInt(3);

            if (inputRating==0) {
                list.movieList.stream().filter(movieInfo -> movieInfo.getRating()==0).forEach(System.out::println);

            } else if (inputRating==1) {
                list.movieList.stream().filter(movieInfo -> movieInfo.getRating()==1).forEach(System.out::println);

            } else if (inputRating==2) {
                list.movieList.stream().filter(movieInfo -> movieInfo.getRating()==2).forEach(System.out::println);

            }
        } catch (InputMismatchException e) {
            System.out.println("/0~2の整数で検索してください/" + e.getMessage());
        }
    }
}