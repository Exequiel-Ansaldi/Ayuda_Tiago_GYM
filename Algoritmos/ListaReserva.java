package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class ListaReserva {
    private List<Reserva> reservas;


    public List<Reserva> getReservas() {
        return this.reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }


    public Cliente masGastoEnUnaMarca(Marca marca){
        Cliente cliente_max = null;
        float reservas_max = Integer.MIN_VALUE;
        List <Cliente> clientes_procesados = new ArrayList<>(); 
        for (Reserva reserva: getReservas()){
            if(!clientes_procesados.contains(reserva.getCliente())){
                clientes_procesados.add(reserva.getCliente());
                float gasto = gastoEnMarca(reserva.getCliente());
                if(gasto > reservas_max){
                    reservas_max = gasto;
                    cliente_max = reserva.getCliente();
                }
            }
            
        }

        return cliente_max;
    }

    public float gastoEnMarca(Cliente cliente){
        float totalgastado = 0;
        for (Reserva reserva : getReservas()){
            if (reserva.getCliente().equals(cliente)){
                totalgastado += reserva.getModelo().getPrecio();
            }
        }
        return totalgastado;
    }

    public Modelo autoMasSolicitado(){
        Modelo modelo_solicitado = null;
        int max_cant = Integer.MIN_VALUE;
        List <Modelo> modelos_procesados = new ArrayList<>();
        for (Reserva reserva : getReservas()){
            if(!modelos_procesados.contains(reserva.getModelo())){
                modelos_procesados.add(reserva.getModelo());
                int cantidad_modelos = contarAuto(reserva.getModelo());
                if (max_cant < cantidad_modelos){
                    max_cant = cantidad_modelos;
                    modelo_solicitado = reserva.getModelo();
                }
            }
        }

        return modelo_solicitado;
    }

    public int contarAuto(Modelo modelo){
        int contador = 0;
        for (Reserva reserva: getReservas()){
            if ( reserva.getModelo().equals(modelo)){
                contador+=1;
            }
        }
        return contador;
    }

    public Agencia agenciaEstadoBueno(){
        Agencia agencia_max = null;
        int cantidad_max = 0;
        List<Agencia> agencias_procesadas = new ArrayList<>();

        for (Reserva reserva: getReservas()){
            if(!agencias_procesadas.contains(reserva.getAgencia())){
                agencias_procesadas.add(reserva.getAgencia());
                int cantidad = contarAgencia(reserva.getAgencia());
                if (cantidad> cantidad_max){
                    cantidad_max = cantidad;
                    agencia_max = reserva.getAgencia();
                }
            }
        }

        return agencia_max;
    }
    

    public int contarAgencia(Agencia agencia){
        int contador = 0;
        for(Reserva reserva: getReservas()){
            if (reserva.getAgencia().equals(agencia) && reserva.getModelo().getEstado().equals(EstadoAutomovil.BUENO)){
                contador+=1;
            }
        }

        return contador;
    }
}
