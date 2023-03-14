class Movies {
    public static void main(String[] args) {
        String[] titles = {"Indiana Jones and the Kingdom of the Crystal Skull", "Indiana Jones and the Last Crusade", "Indiana Jones and the Temple of Doom"};
        String[][] actors = {
                {"actor 1", "actor 2", "actor 3"},
                {"actor 1", "actor 2", "actor 3"},
                {"actor 1", "actor 2", "actor 3"}
        };
        for (int i = 0; i < titles.length; i++) {
            System.out.print("Dans le film " + titles[i] + ", les principaux acteurs sont : ");
            for (int j = 0; j < actors[i].length; j++) {
                System.out.print(actors[i][j] + ", ");
            }
            System.out.println("");
        }
    }
}