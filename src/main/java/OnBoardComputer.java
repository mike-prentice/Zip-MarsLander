public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
        int burn = 0;
        while (status.Altitude > 0){
            if (status.Altitude>=200){
                burn = 200;
            } else if (status.Altitude < 200 && status.Altitude>= 100){
                burn = 200;
            } else {
                burn = (status.Velocity * status.Velocity)/(2 * status.Altitude + 200);
            }
        }

        System.out.println(burn); /*hack!*/
        return burn;
    }

}
