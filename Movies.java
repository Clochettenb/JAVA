class Movies {
    public static void main(String[] args) {
        String[] titles = new String[]{"Indiana Jones and the Kingdom of the Crystal Skull", "Indiana Jones and the Last Crusade", "Indiana Jones and the Temple of Doom"};
        String[][] actors = new String[][]{
                {titles[0], "actor 1", "actor 2", "actor 3"},
                {titles[1], "actor 1", "actor 2", "actor 3"},
                {titles[2], "actor 1", "actor 2", "actor 3"}
        };
        for (String title:titles
             ) {
            System.out.println("Dans le film" ${title}", les principaux acteurs sont" ${actors[0]} + ${actors[1]} + ${actors[2]})
        };
        System.out.println(titles);
        System.out.println(actors);
    }
}