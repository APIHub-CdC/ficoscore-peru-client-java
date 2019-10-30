package io.apihub.client.model;

import java.util.ArrayList;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.List;

public class Score {
	@SerializedName("folioConsultaOtorgante")
	private String folioConsultaOtorgante = null;
	@SerializedName("numConsulta")
	private BigDecimal numConsulta = null;
	@SerializedName("score")
	private BigDecimal score = null;
	@SerializedName("razones")
	private List<Reason> razones = null;


	public Score folioConsultaOtorgante(String folioConsultaOtorgante) {
		this.folioConsultaOtorgante = folioConsultaOtorgante;
		return this;
	}

	@ApiModelProperty(example = "123456789", value = "Es el identificador de la consulta realizada por parte del otorgante. Este folio se regresa de manera integra en el elemento respuesta.")
	public String getFolioConsultaOtorgante() {
		return folioConsultaOtorgante;
	}

	public void setFolioConsultaOtorgante(String folioConsultaOtorgante) {
		this.folioConsultaOtorgante = folioConsultaOtorgante;
	}

	public Score numConsulta(BigDecimal numConsulta) {
		this.numConsulta = numConsulta;
		return this;
	}

	@ApiModelProperty(example = "123.0", value = "Número de consulta")
	public BigDecimal getNumConsulta() {
		return numConsulta;
	}

	public void setNumConsulta(BigDecimal numConsulta) {
		this.numConsulta = numConsulta;
	}

	public Score score(BigDecimal score) {
		this.score = score;
		return this;
	}

	@ApiModelProperty(example = "659.0", value = "Calificación de Fico Score")
	public BigDecimal getScore() {
		return score;
	}

	public void setScore(BigDecimal score) {
		this.score = score;
	}


	public Score razones(List<Reason> razones) {
		this.razones = razones;
		return this;
	}

	public Score addRazonesItem(Reason razonesItem) {
		if (this.razones == null) {
			this.razones = new ArrayList<Reason>();
		}
		this.razones.add(razonesItem);
		return this;
	}

	/**
	 * Razones por las que se generó el score &lt;table&gt;&lt;thead&gt;&lt;tr&gt;&lt;th&gt;Clave&lt;/th&gt;&lt;th&gt;Descripción&lt;/th&gt;&lt;/tr&gt;&lt;/thead&gt;&lt;tbody&gt;&lt;tr&gt;&lt;td&gt;SC&lt;/td&gt;&lt;td&gt;No se calculó el Score por servicio temporalmente no disponible o tiempo en espera demasiado largo&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;C1&lt;/td&gt;&lt;td&gt;No existe el expediente en la base&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;C2&lt;/td&gt;&lt;td&gt;El expediente encontrado solo tiene datos demográficos&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;C4&lt;/td&gt;&lt;td&gt;El expediente encontrado no tiene cuentas activas en los últimos 24 meses o cuentas válidas&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;C6&lt;/td&gt;&lt;td&gt;El expediente sólo tiene registros de Morosidad Comercial, Protestos, Omisos o Deudores&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;C7&lt;/td&gt;&lt;td&gt;Tipo de persona no Natural&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;A1&lt;/td&gt;&lt;td&gt;Últimas cuentas reportadas se encuentran en morosidad&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;A3&lt;/td&gt;&lt;td&gt;El monto de deuda en cuenta(s) es demasiado alto &lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;D2&lt;/td&gt;&lt;td&gt;Existe morosidad en cuenta(s) en el reporte de crédito&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;D8&lt;/td&gt;&lt;td&gt;Existen cuenta(s) en morosidad grave o castigo en el reporte de crédito&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;E0&lt;/td&gt;&lt;td&gt;El solicitante tiene poca experiencia crediticia&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;E1&lt;/td&gt;&lt;td&gt;Falta información demográfica sobre el solicitante de crédito.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;E4&lt;/td&gt;&lt;td&gt;Falta de información reciente de la(s) cuenta(s) en el reporte de crédito&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;F1&lt;/td&gt;&lt;td&gt;Falta de nuevos registros de crédito en el reporte de crédito&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;F7&lt;/td&gt;&lt;td&gt;Falta de información reciente de préstamos en el reporte de crédito&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;F8&lt;/td&gt;&lt;td&gt;Falta de información reciente de préstamo(s) hipotecarios.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;G1&lt;/td&gt;&lt;td&gt;Falta de información reciente de cuentas revolventes en el reporte de crédito&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;G2&lt;/td&gt;&lt;td&gt;Falta de información de préstamos hipotecarios en el reporte de crédito&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;J0&lt;/td&gt;&lt;td&gt;La antigüedad de las cuentas es corta.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;K0&lt;/td&gt;&lt;td&gt;Tiempo transcurrido desde la morosidad en el reporte de crédito es demasiado reciente &lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;K2&lt;/td&gt;&lt;td&gt;Tiempo transcurrido desde la apertura de cuenta más reciente es demasiado corto&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;M1&lt;/td&gt;&lt;td&gt;El número de cuentas con morosidad en el reporte de crédito es muy alto&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;M5&lt;/td&gt;&lt;td&gt;Número de registros adversos en el reporte de crédito es muy alto &lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;N3&lt;/td&gt;&lt;td&gt;Número de préstamos personales activos en el reporte de crédito es muy alto&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;P6&lt;/td&gt;&lt;td&gt;Proporción del saldo respecto al límite en cuenta(s) revolvente(s) es muy alto&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;P9&lt;/td&gt;&lt;td&gt;Proporción del saldo de Préstamo(s) respecto al Monto de los Préstamo(s) es muy alto&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Q0&lt;/td&gt;&lt;td&gt;Proporción del saldo revolvente respecto al saldo total es muy alto&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;R0&lt;/td&gt;&lt;td&gt;Pocas cuentas con pagos al corriente&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;R2&lt;/td&gt;&lt;td&gt;Muy pocas cuentas con información de pago reciente en el reporte de crédito&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;R3&lt;/td&gt;&lt;td&gt;Muy pocas cuentas activas en el reporte de crédito&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;T0&lt;/td&gt;&lt;td&gt;Muchas cuentas aperturadas recientemente en el reporte de crédito&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;T1&lt;/td&gt;&lt;td&gt;Muchas cuentas con saldo en el reporte de crédito&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;T4&lt;/td&gt;&lt;td&gt;Muchos préstamos en el reporte de crédito&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;U7&lt;/td&gt;&lt;td&gt;Muchas cuentas aperturadas a pagos fijos recientemente en el reporte de crédito&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;V3&lt;/td&gt;&lt;td&gt;Muchas cuentas revolventes en el reporte de crédito&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Z3&lt;/td&gt;&lt;td&gt;Registros negativos en el reporte de crédito.&lt;/td&gt;&lt;/tr&gt;&lt;/tbody&gt;&lt;/table&gt;
	 * @return razones
	 **/
	@ApiModelProperty(value = "Razones por las que se generó el score <table><thead><tr><th>Clave</th><th>Descripción</th></tr></thead><tbody><tr><td>SC</td><td>No se calculó el Score por servicio temporalmente no disponible o tiempo en espera demasiado largo</td></tr><tr><td>C1</td><td>No existe el expediente en la base</td></tr><tr><td>C2</td><td>El expediente encontrado solo tiene datos demográficos</td></tr><tr><td>C4</td><td>El expediente encontrado no tiene cuentas activas en los últimos 24 meses o cuentas válidas</td></tr><tr><td>C6</td><td>El expediente sólo tiene registros de Morosidad Comercial, Protestos, Omisos o Deudores</td></tr><tr><td>C7</td><td>Tipo de persona no Natural</td></tr><tr><td>A1</td><td>Últimas cuentas reportadas se encuentran en morosidad</td></tr><tr><td>A3</td><td>El monto de deuda en cuenta(s) es demasiado alto </td></tr><tr><td>D2</td><td>Existe morosidad en cuenta(s) en el reporte de crédito</td></tr><tr><td>D8</td><td>Existen cuenta(s) en morosidad grave o castigo en el reporte de crédito</td></tr><tr><td>E0</td><td>El solicitante tiene poca experiencia crediticia</td></tr><tr><td>E1</td><td>Falta información demográfica sobre el solicitante de crédito.</td></tr><tr><td>E4</td><td>Falta de información reciente de la(s) cuenta(s) en el reporte de crédito</td></tr><tr><td>F1</td><td>Falta de nuevos registros de crédito en el reporte de crédito</td></tr><tr><td>F7</td><td>Falta de información reciente de préstamos en el reporte de crédito</td></tr><tr><td>F8</td><td>Falta de información reciente de préstamo(s) hipotecarios.</td></tr><tr><td>G1</td><td>Falta de información reciente de cuentas revolventes en el reporte de crédito</td></tr><tr><td>G2</td><td>Falta de información de préstamos hipotecarios en el reporte de crédito</td></tr><tr><td>J0</td><td>La antigüedad de las cuentas es corta.</td></tr><tr><td>K0</td><td>Tiempo transcurrido desde la morosidad en el reporte de crédito es demasiado reciente </td></tr><tr><td>K2</td><td>Tiempo transcurrido desde la apertura de cuenta más reciente es demasiado corto</td></tr><tr><td>M1</td><td>El número de cuentas con morosidad en el reporte de crédito es muy alto</td></tr><tr><td>M5</td><td>Número de registros adversos en el reporte de crédito es muy alto </td></tr><tr><td>N3</td><td>Número de préstamos personales activos en el reporte de crédito es muy alto</td></tr><tr><td>P6</td><td>Proporción del saldo respecto al límite en cuenta(s) revolvente(s) es muy alto</td></tr><tr><td>P9</td><td>Proporción del saldo de Préstamo(s) respecto al Monto de los Préstamo(s) es muy alto</td></tr><tr><td>Q0</td><td>Proporción del saldo revolvente respecto al saldo total es muy alto</td></tr><tr><td>R0</td><td>Pocas cuentas con pagos al corriente</td></tr><tr><td>R2</td><td>Muy pocas cuentas con información de pago reciente en el reporte de crédito</td></tr><tr><td>R3</td><td>Muy pocas cuentas activas en el reporte de crédito</td></tr><tr><td>T0</td><td>Muchas cuentas aperturadas recientemente en el reporte de crédito</td></tr><tr><td>T1</td><td>Muchas cuentas con saldo en el reporte de crédito</td></tr><tr><td>T4</td><td>Muchos préstamos en el reporte de crédito</td></tr><tr><td>U7</td><td>Muchas cuentas aperturadas a pagos fijos recientemente en el reporte de crédito</td></tr><tr><td>V3</td><td>Muchas cuentas revolventes en el reporte de crédito</td></tr><tr><td>Z3</td><td>Registros negativos en el reporte de crédito.</td></tr></tbody></table>")
	public List<Reason> getRazones() {
		return razones;
	}

	public void setRazones(List<Reason> razones) {
		this.razones = razones;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Score score = (Score) o;
		return Objects.equals(this.folioConsultaOtorgante, score.folioConsultaOtorgante)
				&& Objects.equals(this.numConsulta, score.numConsulta)
				&& Objects.equals(this.score, score.score) &&
				Objects.equals(this.razones, score.razones);
	}

	@Override
	public int hashCode() {
		return Objects.hash(folioConsultaOtorgante, numConsulta, score, razones);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Score {\n");

		sb.append("    folioConsultaOtorgante: ").append(toIndentedString(folioConsultaOtorgante)).append("\n");
		sb.append("    numConsulta: ").append(toIndentedString(numConsulta)).append("\n");
		sb.append("    score: ").append(toIndentedString(score)).append("\n");
		sb.append("    razones: ").append(toIndentedString(razones)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
