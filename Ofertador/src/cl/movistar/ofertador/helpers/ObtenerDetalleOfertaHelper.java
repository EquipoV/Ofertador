/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.movistar.ofertador.helpers;

import cl.movistar.ofertador.dto.ResponseDetalleOferta;
import cl.movistar.ofertador.dto.RespuestaServicio;
import cl.movistar.ofertador.dto.detalleoferta.Canal;
import cl.movistar.ofertador.dto.detalleoferta.CaracteristicaProducto;
import cl.movistar.ofertador.dto.detalleoferta.DetalleOferta;
import cl.movistar.ofertador.dto.detalleoferta.Precio;
import cl.movistar.ofertador.dto.detalleoferta.Producto;
import cl.movistar.ofertador.dto.detalleoferta.SegmentoMercado;

/**
 *
 * @author Esteban
 */
public class ObtenerDetalleOfertaHelper {
    
    public ResponseDetalleOferta obtenerRespuestaEnDuro() {

        ResponseDetalleOferta responseDetalleOferta = new ResponseDetalleOferta();

        RespuestaServicio respuestaServicio = new RespuestaServicio();
        respuestaServicio.setCodigo(1);

        respuestaServicio.setMensaje("Mensaje");

        responseDetalleOferta.setRespuestaServicio(respuestaServicio);
        DetalleOferta detalleOferta = new DetalleOferta();
        detalleOferta.setCantidadPuntos(99);
        detalleOferta.setCodigoOferta("Codigo Oferta");
        detalleOferta.setCodigoOfertaRed("Codigo Red");
        detalleOferta.setConsumo("Consumo");
        detalleOferta.setDescripcion("Descripcion");
        detalleOferta.setEstado("Estado");
        detalleOferta.setFamilia("Familia");
        detalleOferta.setFamiliaridad("Familiaridad");
        detalleOferta.setFechaInicio("11/12/198");
        detalleOferta.setFechaTermino("11/12/2014");
        detalleOferta.setHorarioVenta("12:00");
        detalleOferta.setIdRed("idRed");
        detalleOferta.setIdUsuario(111);
        detalleOferta.setIdValidacion(222);
        detalleOferta.setNombre("Nombre");

        detalleOferta.setSubFamilia("Sub Familia");
        detalleOferta.setTipoCargo("Tipo Cargo");
        detalleOferta.setTipoDestino("Tipo Destino");
        detalleOferta.setTipoOferta("Tipo Oferta");
        detalleOferta.setTipoVigencia("Tipo Vigencia");
        detalleOferta.setTipoVisualizacion("Tipo Visualización");
        detalleOferta.setValidacionRed("Validacion de Red");
        detalleOferta.setValorCliente("Valor Cliente");

        // Precio
        Precio precio1 = new Precio();
        precio1.setCodigoServicioSuplementario("Codigo SS");
        precio1.setCodigoTasacion("Codigo tasación");
        precio1.setConceptoFacturacion(89);
        precio1.setDescuentoOferta("Descuento");
        precio1.setNombreFacturacion("Nombre Facturación");
        precio1.setPrecioOferta(2000);
        precio1.setTipoMoneda("Moneda");
        // Canal
        Canal canal1 = new Canal();
        canal1.setDescripcion("Descripción canal");
        canal1.setIdCanal(234);
        canal1.setNombre("Nombre canal");
        canal1.setNombreOferta("Nombre Oferta");
        Canal[] canales = new Canal[]{canal1};

        precio1.setCanales(canales);
        Precio[] precios = new Precio[]{precio1};

        detalleOferta.setPrecios(precios);
        // Producto
        Producto producto1 = new Producto();
        producto1.setCodigoProducto("Código Producto");
        producto1.setEstado("Estado");
        producto1.setNombre("Nombre Producto");

        // Caracteristica producto
        CaracteristicaProducto caracteristicaProducto1 = new CaracteristicaProducto();
        caracteristicaProducto1
                .setCodigoCaracteristicaProducto("Código CaractProd");
        caracteristicaProducto1.setDescripcion("Descripción");
        caracteristicaProducto1.setNombre("Nombre");
        caracteristicaProducto1.setTecnologia("Tecnología");
        caracteristicaProducto1.setTipoUnidad("Tipo Unidad");
        caracteristicaProducto1.setUnidad("Unidad");
        caracteristicaProducto1.setValocidadMaxima("Vel máxima");
        caracteristicaProducto1.setVelocidadReducida("Vel reducida");
        CaracteristicaProducto[] caracteristicasProducto = new CaracteristicaProducto[]{caracteristicaProducto1};
        producto1.setCaracteristicasProducto(caracteristicasProducto);

        Producto[] productos = new Producto[]{producto1};
        detalleOferta.setProductos(productos);
        detalleOferta
                .setRestricciones("Restriccion1 Restriccion2 Restriccion3");

        // Segmento Mercado
        SegmentoMercado segmento1 = new SegmentoMercado();
        segmento1.setDescripcion("Descripción");
        segmento1.setIdSegmentoMercado(456);
        segmento1.setNombre("Nombre");
        SegmentoMercado[] segmentosMercado = new SegmentoMercado[]{segmento1};
        detalleOferta.setSegmentosMercado(segmentosMercado);

        responseDetalleOferta.setDetalleOferta(detalleOferta);

        return responseDetalleOferta;
    }
    
       public DetalleOferta obtenerParametros(
            cl.movistar.obtenerdetalleoferta.dto.DetalleOferta detalleOfertaCatalogo) {
        DetalleOferta detalleOfertaOfertador = new DetalleOferta();

        detalleOfertaOfertador.setCantidadPuntos(detalleOfertaCatalogo.getCantidadPuntos());
        detalleOfertaOfertador.setCodigoOferta(detalleOfertaCatalogo.getCodigoOferta());
        detalleOfertaOfertador.setCodigoOfertaRed(detalleOfertaCatalogo.getCodigoOfertaRed());
        detalleOfertaOfertador.setConsumo(detalleOfertaCatalogo.getConsumo());
        detalleOfertaOfertador.setDescripcion(detalleOfertaCatalogo.getDescripcion());
        detalleOfertaOfertador.setEstado(detalleOfertaCatalogo.getEstado());
        detalleOfertaOfertador.setFamilia(detalleOfertaCatalogo.getFamilia());
        detalleOfertaOfertador.setFamiliaridad(detalleOfertaCatalogo.getFamiliaridad());
        detalleOfertaOfertador.setFechaInicio(detalleOfertaCatalogo.getFechaInicio());
        detalleOfertaOfertador.setFechaTermino(detalleOfertaCatalogo.getFechaTermino());
        detalleOfertaOfertador.setHorarioVenta(detalleOfertaCatalogo.getHorarioVenta());
        detalleOfertaOfertador.setIdRed(detalleOfertaCatalogo.getIdRed());
        detalleOfertaOfertador.setIdUsuario(detalleOfertaCatalogo.getIdUsuario());
        detalleOfertaOfertador.setIdValidacion(detalleOfertaCatalogo.getIdValidacion());
        detalleOfertaOfertador.setNombre(detalleOfertaCatalogo.getNombre());
        detalleOfertaOfertador.setRestricciones(detalleOfertaCatalogo.getRestricciones());
        detalleOfertaOfertador.setSubFamilia(detalleOfertaCatalogo.getSubFamilia());
        detalleOfertaOfertador.setTipoCargo(detalleOfertaCatalogo.getTipoCargo());
        detalleOfertaOfertador.setTipoDestino(detalleOfertaCatalogo.getTipoDestino());
        detalleOfertaOfertador.setTipoOferta(detalleOfertaCatalogo.getTipoOferta());
        detalleOfertaOfertador.setTipoVigencia(detalleOfertaCatalogo.getTipoVigencia());
        detalleOfertaOfertador.setTipoVisualizacion(detalleOfertaCatalogo.getTipoVisualizacion());
        detalleOfertaOfertador.setValidacionRed(detalleOfertaCatalogo.getValidacionRed());
        detalleOfertaOfertador.setValorCliente(detalleOfertaCatalogo.getValorCliente());

        Precio[] precios = obtenerPrecios(detalleOfertaCatalogo);
        detalleOfertaOfertador.setPrecios(precios);

        Producto[] productos = obtenerProductos(detalleOfertaCatalogo);
        detalleOfertaOfertador.setProductos(productos);

        SegmentoMercado[] segmentosMercado = obtenerSegmentosMercado(detalleOfertaCatalogo);
        detalleOfertaOfertador.setSegmentosMercado(segmentosMercado);

        return detalleOfertaOfertador;
    }
       
       private SegmentoMercado[] obtenerSegmentosMercado(
            cl.movistar.obtenerdetalleoferta.dto.DetalleOferta detalleOfertaCatalogo) {

        cl.movistar.obtenerdetalleoferta.dto.SegmentoMercado[] segmentosMercadoCatalogo = detalleOfertaCatalogo.getSegmentosMercado();

        SegmentoMercado[] segmentosMercadoOfertador = new SegmentoMercado[segmentosMercadoCatalogo.length];
        for (int i = 0; i < segmentosMercadoCatalogo.length; i++) {

            SegmentoMercado segmentoMercadoOfertador = new SegmentoMercado();

            segmentoMercadoOfertador.setDescripcion(segmentosMercadoCatalogo[i].getDescripcion());
            segmentoMercadoOfertador.setIdSegmentoMercado(segmentosMercadoCatalogo[i].getIdSegmentoMercado());
            segmentoMercadoOfertador.setNombre(segmentosMercadoCatalogo[i].getNombre());

            segmentosMercadoOfertador[i] = segmentoMercadoOfertador;
        }

        return segmentosMercadoOfertador;
    }

    private Producto[] obtenerProductos(
            cl.movistar.obtenerdetalleoferta.dto.DetalleOferta detalleOfertaCatalogo) {

        cl.movistar.obtenerdetalleoferta.dto.Producto[] productosCatalogo = detalleOfertaCatalogo.getProductos();
        Producto[] productosOfertador = new Producto[productosCatalogo.length];



        for (int i = 0; i < productosCatalogo.length; i++) {

            Producto producto = new Producto();
            producto.setCodigoProducto(productosCatalogo[i].getCodigoProducto());
            producto.setEstado(productosCatalogo[i].getEstado());
            producto.setNombre(productosCatalogo[i].getNombre());

            CaracteristicaProducto[] caracteristicasProducto = obtenerCaracteristicaProducto(productosCatalogo[i]);
            producto.setCaracteristicasProducto(caracteristicasProducto);

            productosOfertador[i] = producto;

        }

        return productosOfertador;
    }

    private CaracteristicaProducto[] obtenerCaracteristicaProducto(
            cl.movistar.obtenerdetalleoferta.dto.Producto productoCatalogo) {

        cl.movistar.obtenerdetalleoferta.dto.CaracteristicaProducto[] caracteristicasCatalogo = productoCatalogo.getCaracteristicasProducto();
        CaracteristicaProducto[] caracteristicasProductoOfertador = new CaracteristicaProducto[caracteristicasCatalogo.length];


        for (int i = 0; i < caracteristicasCatalogo.length; i++) {

            CaracteristicaProducto caracteristicaProducto = new CaracteristicaProducto();
            caracteristicaProducto.setCodigoCaracteristicaProducto(caracteristicasCatalogo[i].getCodigoCaracteristicaProducto());
            caracteristicaProducto.setDescripcion(caracteristicasCatalogo[i].getDescripcion());
            caracteristicaProducto.setNombre(caracteristicasCatalogo[i].getNombre());
            caracteristicaProducto.setTecnologia(caracteristicasCatalogo[i].getTecnologia());
            caracteristicaProducto.setTipoUnidad(caracteristicasCatalogo[i].getTipoUnidad());
            caracteristicaProducto.setUnidad(caracteristicasCatalogo[i].getUnidad());
            caracteristicaProducto.setValocidadMaxima(caracteristicasCatalogo[i].getVelocidadMaxima());
            caracteristicaProducto.setVelocidadReducida(caracteristicasCatalogo[i].getVelocidadReducida());

            caracteristicasProductoOfertador[i] = caracteristicaProducto;

        }


        return caracteristicasProductoOfertador;
    }
    private Precio[] obtenerPrecios(
            cl.movistar.obtenerdetalleoferta.dto.DetalleOferta detalleOfertaCatalogo) {
        cl.movistar.obtenerdetalleoferta.dto.Precio[] preciosCatalogo = detalleOfertaCatalogo.getPrecios();
        Precio[] preciosOfertador = new Precio[preciosCatalogo.length];


        for (int i = 0; i < preciosCatalogo.length; i++) {
            Precio precioItem = new Precio();

            precioItem.setCodigoServicioSuplementario(preciosCatalogo[i].getCodigoServicioSuplementario());
            precioItem.setCodigoTasacion(preciosCatalogo[i].getCodigoTasacion());
            precioItem.setConceptoFacturacion(preciosCatalogo[i].getConceptoFacturacion());
            precioItem.setDescuentoOferta(preciosCatalogo[i].getDescuentoOferta());
            precioItem.setNombreFacturacion(preciosCatalogo[i].getNombreFacturacion());
            precioItem.setPrecioOferta(preciosCatalogo[i].getPrecioOferta());
            precioItem.setTipoMoneda(preciosCatalogo[i].getTipoMoneda());

            Canal[] canales = obtenerCanales(preciosCatalogo[i]);
            precioItem.setCanales(canales);

            preciosOfertador[i] = precioItem;
        }

        return preciosOfertador;
    }

    private Canal[] obtenerCanales(
            cl.movistar.obtenerdetalleoferta.dto.Precio precioCatalogo) {
        cl.movistar.obtenerdetalleoferta.dto.Canal[] canalesCatalogo = precioCatalogo.getCanales();
        Canal[] canalesOfertador = new Canal[canalesCatalogo.length];



        for (int i = 0; i < canalesCatalogo.length; i++) {

            Canal canal = new Canal();

            canal.setDescripcion(canalesCatalogo[i].getDescripcion());
            canal.setIdCanal(canalesCatalogo[i].getIdCanal());
            canal.setNombre(canalesCatalogo[i].getNombre());
            canal.setNombreOferta(canalesCatalogo[i].getNombreOferta());

            canalesOfertador[i] = canal;
        }

        return canalesOfertador;
    }
    
}
