package model.metodologia;

import org.uqbar.commons.utils.Observable;

import model.BaseDeDatos;
import model.Empresa;
import model.Indicador;
import model.metodologia.condiciones.BooleanCondition;

//Mismo indicador pero para otra empresa, optimizar el indicador dado
@Observable
public class CondicionNoTaxativa extends Condicion{
	private Integer pesoEstimado;
	
	public CondicionNoTaxativa(Integer periodo, Indicador indicadorAOptimizar,
			BooleanCondition criterioComparacion/*, Integer pesoEstimado*/) {
		super(periodo, indicadorAOptimizar, criterioComparacion);
		this.pesoEstimado = pesoEstimado;
	}

	// TODO No taxativa, retorna al ganador
	public boolean compararEmpresas(Empresa empresaUno, Empresa empresaDos, BaseDeDatos baseDeDatos) {
		boolean resultado = true;
		for(int i = 0; i < periodo; i++){
			if(!(criterioComparacion.comparar(indicadorAOptimizar.getValor(2017-i, empresaUno, baseDeDatos),  
					indicadorAOptimizar.getValor(2017-i, empresaDos, baseDeDatos))))
				resultado = false;
		}
		return resultado;
	}
	
	public Integer getPesoEstimado() {
		return pesoEstimado;
	}
	
	@Override
	public String toString(){
		return "Periodo: "+periodo+" Indicador: "+indicadorAOptimizar;
	}
}
