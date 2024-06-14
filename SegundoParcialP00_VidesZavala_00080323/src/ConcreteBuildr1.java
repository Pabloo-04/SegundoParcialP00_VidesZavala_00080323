public class ConcreteBuildr1 implements MessageBuilder
{
    @Override
    public void reset() {
        return;
    }

    @Override
    public void buildStepEmail() {
        System.out.println("Se ha enviado una notificación por correo Electronico");
    }

    @Override
    public void buildStepAlert() {
        System.out.println("Se ha mostrado una alerta en pantalla");
    }

    @Override
    public void buildSaveLog() {
        System.out.println("Se ha guardado un registro un archivo en log.");
    }

}
