public class Exercicio2 {

    public static void main(String[] args) {

        // Dados de entrada
        double lat1 = 25.0;
        double lon1 = 35.0;
        double lat2 = 35.5;
        double lon2 = 25.5;

        // Raio da Terra em km
        double raio = 6371.01;

        // Converter graus para radianos
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);

        // Aplicando a fórmula
        double distancia = raio * Math.acos(
                Math.sin(lat1) * Math.sin(lat2) +
                Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2)
        );

        // Saída
        System.out.println("A distância entre esses pontos é: " + distancia + " km");
    }
}