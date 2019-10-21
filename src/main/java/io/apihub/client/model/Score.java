package io.apihub.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

public class Score {
	@SerializedName("folioConsultaOtorgante")
	private String folioConsultaOtorgante = null;
	@SerializedName("numConsulta")
	private BigDecimal numConsulta = null;
	@SerializedName("nombreScore")
	private String nombreScore = null;
	@SerializedName("score")
	private BigDecimal score = null;

	@JsonAdapter(ReasonCode1Enum.Adapter.class)
	public enum ReasonCode1Enum {
		A1("A1"),

		A3("A3"),

		C1("C1"),

		C2("C2"),

		C4("C4"),

		C6("C6"),

		C7("C7"),

		D2("D2"),

		D8("D8"),

		E0("E0"),

		E1("E1"),

		E4("E4"),

		F1("F1"),

		F7("F7"),

		F8("F8"),

		G1("G1"),

		G2("G2"),

		J0("J0"),

		K0("K0"),

		K2("K2"),

		M1("M1"),

		M5("M5"),

		N3("N3"),

		P6("P6"),

		P9("P9"),

		Q0("Q0"),

		R0("R0"),

		R2("R2"),

		R3("R3"),

		SC("SC"),

		T0("T0"),

		T1("T1"),

		T4("T4"),

		U7("U7"),

		V3("V3"),

		Z3("Z3");
		private String value;

		ReasonCode1Enum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static ReasonCode1Enum fromValue(String text) {
			for (ReasonCode1Enum b : ReasonCode1Enum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		public static class Adapter extends TypeAdapter<ReasonCode1Enum> {
			@Override
			public void write(final JsonWriter jsonWriter, final ReasonCode1Enum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public ReasonCode1Enum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return ReasonCode1Enum.fromValue(String.valueOf(value));
			}
		}
	}

	@SerializedName("reasonCode1")
	private ReasonCode1Enum reasonCode1 = null;

	@JsonAdapter(ReasonCode2Enum.Adapter.class)
	public enum ReasonCode2Enum {
		A1("A1"),

		A3("A3"),

		C1("C1"),

		C2("C2"),

		C4("C4"),

		C6("C6"),

		C7("C7"),

		D2("D2"),

		D8("D8"),

		E0("E0"),

		E1("E1"),

		E4("E4"),

		F1("F1"),

		F7("F7"),

		F8("F8"),

		G1("G1"),

		G2("G2"),

		J0("J0"),

		K0("K0"),

		K2("K2"),

		M1("M1"),

		M5("M5"),

		N3("N3"),

		P6("P6"),

		P9("P9"),

		Q0("Q0"),

		R0("R0"),

		R2("R2"),

		R3("R3"),

		SC("SC"),

		T0("T0"),

		T1("T1"),

		T4("T4"),

		U7("U7"),

		V3("V3"),

		Z3("Z3");
		private String value;

		ReasonCode2Enum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static ReasonCode2Enum fromValue(String text) {
			for (ReasonCode2Enum b : ReasonCode2Enum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		public static class Adapter extends TypeAdapter<ReasonCode2Enum> {
			@Override
			public void write(final JsonWriter jsonWriter, final ReasonCode2Enum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public ReasonCode2Enum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return ReasonCode2Enum.fromValue(String.valueOf(value));
			}
		}
	}

	@SerializedName("reasonCode2")
	private ReasonCode2Enum reasonCode2 = null;

	@JsonAdapter(ReasonCode3Enum.Adapter.class)
	public enum ReasonCode3Enum {
		A1("A1"),

		A3("A3"),

		C1("C1"),

		C2("C2"),

		C4("C4"),

		C6("C6"),

		C7("C7"),

		D2("D2"),

		D8("D8"),

		E0("E0"),

		E1("E1"),

		E4("E4"),

		F1("F1"),

		F7("F7"),

		F8("F8"),

		G1("G1"),

		G2("G2"),

		J0("J0"),

		K0("K0"),

		K2("K2"),

		M1("M1"),

		M5("M5"),

		N3("N3"),

		P6("P6"),

		P9("P9"),

		Q0("Q0"),

		R0("R0"),

		R2("R2"),

		R3("R3"),

		SC("SC"),

		T0("T0"),

		T1("T1"),

		T4("T4"),

		U7("U7"),

		V3("V3"),

		Z3("Z3");
		private String value;

		ReasonCode3Enum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static ReasonCode3Enum fromValue(String text) {
			for (ReasonCode3Enum b : ReasonCode3Enum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		public static class Adapter extends TypeAdapter<ReasonCode3Enum> {
			@Override
			public void write(final JsonWriter jsonWriter, final ReasonCode3Enum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public ReasonCode3Enum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return ReasonCode3Enum.fromValue(String.valueOf(value));
			}
		}
	}

	@SerializedName("reasonCode3")
	private ReasonCode3Enum reasonCode3 = null;

	@JsonAdapter(ReasonCode4Enum.Adapter.class)
	public enum ReasonCode4Enum {
		A1("A1"),

		A3("A3"),

		C1("C1"),

		C2("C2"),

		C4("C4"),

		C6("C6"),

		C7("C7"),

		D2("D2"),

		D8("D8"),

		E0("E0"),

		E1("E1"),

		E4("E4"),

		F1("F1"),

		F7("F7"),

		F8("F8"),

		G1("G1"),

		G2("G2"),

		J0("J0"),

		K0("K0"),

		K2("K2"),

		M1("M1"),

		M5("M5"),

		N3("N3"),

		P6("P6"),

		P9("P9"),

		Q0("Q0"),

		R0("R0"),

		R2("R2"),

		R3("R3"),

		SC("SC"),

		T0("T0"),

		T1("T1"),

		T4("T4"),

		U7("U7"),

		V3("V3"),

		Z3("Z3");
		private String value;

		ReasonCode4Enum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static ReasonCode4Enum fromValue(String text) {
			for (ReasonCode4Enum b : ReasonCode4Enum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		public static class Adapter extends TypeAdapter<ReasonCode4Enum> {
			@Override
			public void write(final JsonWriter jsonWriter, final ReasonCode4Enum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public ReasonCode4Enum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return ReasonCode4Enum.fromValue(String.valueOf(value));
			}
		}
	}

	@SerializedName("reasonCode4")
	private ReasonCode4Enum reasonCode4 = null;

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

	public Score nombreScore(String nombreScore) {
		this.nombreScore = nombreScore;
		return this;
	}

	@ApiModelProperty(example = "FICO SCORE", value = "Nombre del score")
	public String getNombreScore() {
		return nombreScore;
	}

	public void setNombreScore(String nombreScore) {
		this.nombreScore = nombreScore;
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

	public Score reasonCode1(ReasonCode1Enum reasonCode1) {
		this.reasonCode1 = reasonCode1;
		return this;
	}

	@ApiModelProperty(example = "F7", value = "<table><thead><tr><th>Clave</th><th>Descripción</th></tr></thead><tbody><tr><td>SC</td><td>No se calculó el Score por servicio temporalmente no disponible o tiempo en espera demasiado largo</td></tr><tr><td>C1</td><td>No existe el expediente en la base</td></tr><tr><td>C2</td><td>El expediente encontrado solo tiene datos demográficos</td></tr><tr><td>C4</td><td>El expediente encontrado no tiene cuentas activas en los últimos 24 meses o cuentas válidas</td></tr><tr><td>C6</td><td>El expediente sólo tiene registros de Morosidad Comercial, Protestos, Omisos o Deudores</td></tr><tr><td>C7</td><td>Tipo de persona no Natural</td></tr><tr><td>A1</td><td>Últimas cuentas reportadas se encuentran en morosidad</td></tr><tr><td>A3</td><td>El monto de deuda en cuenta(s) es demasiado alto </td></tr><tr><td>D2</td><td>Existe morosidad en cuenta(s) en el reporte de crédito</td></tr><tr><td>D8</td><td>Existen cuenta(s) en morosidad grave o castigo en el reporte de crédito</td></tr><tr><td>E0</td><td>El solicitante tiene poca experiencia crediticia</td></tr><tr><td>E1</td><td>Falta información demográfica sobre el solicitante de crédito.</td></tr><tr><td>E4</td><td>Falta de información reciente de la(s) cuenta(s) en el reporte de crédito</td></tr><tr><td>F1</td><td>Falta de nuevos registros de crédito en el reporte de crédito</td></tr><tr><td>F7</td><td>Falta de información reciente de préstamos en el reporte de crédito</td></tr><tr><td>F8</td><td>Falta de información reciente de préstamo(s) hipotecarios.</td></tr><tr><td>G1</td><td>Falta de información reciente de cuentas revolventes en el reporte de crédito</td></tr><tr><td>G2</td><td>Falta de información de préstamos hipotecarios en el reporte de crédito</td></tr><tr><td>J0</td><td>La antigüedad de las cuentas es corta.</td></tr><tr><td>K0</td><td>Tiempo transcurrido desde la morosidad en el reporte de crédito es demasiado reciente </td></tr><tr><td>K2</td><td>Tiempo transcurrido desde la apertura de cuenta más reciente es demasiado corto</td></tr><tr><td>M1</td><td>El número de cuentas con morosidad en el reporte de crédito es muy alto</td></tr><tr><td>M5</td><td>Número de registros adversos en el reporte de crédito es muy alto </td></tr><tr><td>N3</td><td>Número de préstamos personales activos en el reporte de crédito es muy alto</td></tr><tr><td>P6</td><td>Proporción del saldo respecto al límite en cuenta(s) revolvente(s) es muy alto</td></tr><tr><td>P9</td><td>Proporción del saldo de Préstamo(s) respecto al Monto de los Préstamo(s) es muy alto</td></tr><tr><td>Q0</td><td>Proporción del saldo revolvente respecto al saldo total es muy alto</td></tr><tr><td>R0</td><td>Pocas cuentas con pagos al corriente</td></tr><tr><td>R2</td><td>Muy pocas cuentas con información de pago reciente en el reporte de crédito</td></tr><tr><td>R3</td><td>Muy pocas cuentas activas en el reporte de crédito</td></tr><tr><td>T0</td><td>Muchas cuentas aperturadas recientemente en el reporte de crédito</td></tr><tr><td>T1</td><td>Muchas cuentas con saldo en el reporte de crédito</td></tr><tr><td>T4</td><td>Muchos préstamos en el reporte de crédito</td></tr><tr><td>U7</td><td>Muchas cuentas aperturadas a pagos fijos recientemente en el reporte de crédito</td></tr><tr><td>V3</td><td>Muchas cuentas revolventes en el reporte de crédito</td></tr><tr><td>Z3</td><td>Registros negativos en el reporte de crédito.</td></tr></tbody></table>")
	public ReasonCode1Enum getReasonCode1() {
		return reasonCode1;
	}

	public void setReasonCode1(ReasonCode1Enum reasonCode1) {
		this.reasonCode1 = reasonCode1;
	}

	public Score reasonCode2(ReasonCode2Enum reasonCode2) {
		this.reasonCode2 = reasonCode2;
		return this;
	}

	@ApiModelProperty(example = "A3", value = "<table><thead><tr><th>Clave</th><th>Descripción</th></tr></thead><tbody><tr><td>SC</td><td>No se calculó el Score por servicio temporalmente no disponible o tiempo en espera demasiado largo</td></tr><tr><td>C1</td><td>No existe el expediente en la base</td></tr><tr><td>C2</td><td>El expediente encontrado solo tiene datos demográficos</td></tr><tr><td>C4</td><td>El expediente encontrado no tiene cuentas activas en los últimos 24 meses o cuentas válidas</td></tr><tr><td>C6</td><td>El expediente sólo tiene registros de Morosidad Comercial, Protestos, Omisos o Deudores</td></tr><tr><td>C7</td><td>Tipo de persona no Natural</td></tr><tr><td>A1</td><td>Últimas cuentas reportadas se encuentran en morosidad</td></tr><tr><td>A3</td><td>El monto de deuda en cuenta(s) es demasiado alto </td></tr><tr><td>D2</td><td>Existe morosidad en cuenta(s) en el reporte de crédito</td></tr><tr><td>D8</td><td>Existen cuenta(s) en morosidad grave o castigo en el reporte de crédito</td></tr><tr><td>E0</td><td>El solicitante tiene poca experiencia crediticia</td></tr><tr><td>E1</td><td>Falta información demográfica sobre el solicitante de crédito.</td></tr><tr><td>E4</td><td>Falta de información reciente de la(s) cuenta(s) en el reporte de crédito</td></tr><tr><td>F1</td><td>Falta de nuevos registros de crédito en el reporte de crédito</td></tr><tr><td>F7</td><td>Falta de información reciente de préstamos en el reporte de crédito</td></tr><tr><td>F8</td><td>Falta de información reciente de préstamo(s) hipotecarios.</td></tr><tr><td>G1</td><td>Falta de información reciente de cuentas revolventes en el reporte de crédito</td></tr><tr><td>G2</td><td>Falta de información de préstamos hipotecarios en el reporte de crédito</td></tr><tr><td>J0</td><td>La antigüedad de las cuentas es corta.</td></tr><tr><td>K0</td><td>Tiempo transcurrido desde la morosidad en el reporte de crédito es demasiado reciente </td></tr><tr><td>K2</td><td>Tiempo transcurrido desde la apertura de cuenta más reciente es demasiado corto</td></tr><tr><td>M1</td><td>El número de cuentas con morosidad en el reporte de crédito es muy alto</td></tr><tr><td>M5</td><td>Número de registros adversos en el reporte de crédito es muy alto </td></tr><tr><td>N3</td><td>Número de préstamos personales activos en el reporte de crédito es muy alto</td></tr><tr><td>P6</td><td>Proporción del saldo respecto al límite en cuenta(s) revolvente(s) es muy alto</td></tr><tr><td>P9</td><td>Proporción del saldo de Préstamo(s) respecto al Monto de los Préstamo(s) es muy alto</td></tr><tr><td>Q0</td><td>Proporción del saldo revolvente respecto al saldo total es muy alto</td></tr><tr><td>R0</td><td>Pocas cuentas con pagos al corriente</td></tr><tr><td>R2</td><td>Muy pocas cuentas con información de pago reciente en el reporte de crédito</td></tr><tr><td>R3</td><td>Muy pocas cuentas activas en el reporte de crédito</td></tr><tr><td>T0</td><td>Muchas cuentas aperturadas recientemente en el reporte de crédito</td></tr><tr><td>T1</td><td>Muchas cuentas con saldo en el reporte de crédito</td></tr><tr><td>T4</td><td>Muchos préstamos en el reporte de crédito</td></tr><tr><td>U7</td><td>Muchas cuentas aperturadas a pagos fijos recientemente en el reporte de crédito</td></tr><tr><td>V3</td><td>Muchas cuentas revolventes en el reporte de crédito</td></tr><tr><td>Z3</td><td>Registros negativos en el reporte de crédito.</td></tr></tbody></table>")
	public ReasonCode2Enum getReasonCode2() {
		return reasonCode2;
	}

	public void setReasonCode2(ReasonCode2Enum reasonCode2) {
		this.reasonCode2 = reasonCode2;
	}

	public Score reasonCode3(ReasonCode3Enum reasonCode3) {
		this.reasonCode3 = reasonCode3;
		return this;
	}

	@ApiModelProperty(example = "K2", value = "<table><thead><tr><th>Clave</th><th>Descripción</th></tr></thead><tbody><tr><td>SC</td><td>No se calculó el Score por servicio temporalmente no disponible o tiempo en espera demasiado largo</td></tr><tr><td>C1</td><td>No existe el expediente en la base</td></tr><tr><td>C2</td><td>El expediente encontrado solo tiene datos demográficos</td></tr><tr><td>C4</td><td>El expediente encontrado no tiene cuentas activas en los últimos 24 meses o cuentas válidas</td></tr><tr><td>C6</td><td>El expediente sólo tiene registros de Morosidad Comercial, Protestos, Omisos o Deudores</td></tr><tr><td>C7</td><td>Tipo de persona no Natural</td></tr><tr><td>A1</td><td>Últimas cuentas reportadas se encuentran en morosidad</td></tr><tr><td>A3</td><td>El monto de deuda en cuenta(s) es demasiado alto </td></tr><tr><td>D2</td><td>Existe morosidad en cuenta(s) en el reporte de crédito</td></tr><tr><td>D8</td><td>Existen cuenta(s) en morosidad grave o castigo en el reporte de crédito</td></tr><tr><td>E0</td><td>El solicitante tiene poca experiencia crediticia</td></tr><tr><td>E1</td><td>Falta información demográfica sobre el solicitante de crédito.</td></tr><tr><td>E4</td><td>Falta de información reciente de la(s) cuenta(s) en el reporte de crédito</td></tr><tr><td>F1</td><td>Falta de nuevos registros de crédito en el reporte de crédito</td></tr><tr><td>F7</td><td>Falta de información reciente de préstamos en el reporte de crédito</td></tr><tr><td>F8</td><td>Falta de información reciente de préstamo(s) hipotecarios.</td></tr><tr><td>G1</td><td>Falta de información reciente de cuentas revolventes en el reporte de crédito</td></tr><tr><td>G2</td><td>Falta de información de préstamos hipotecarios en el reporte de crédito</td></tr><tr><td>J0</td><td>La antigüedad de las cuentas es corta.</td></tr><tr><td>K0</td><td>Tiempo transcurrido desde la morosidad en el reporte de crédito es demasiado reciente </td></tr><tr><td>K2</td><td>Tiempo transcurrido desde la apertura de cuenta más reciente es demasiado corto</td></tr><tr><td>M1</td><td>El número de cuentas con morosidad en el reporte de crédito es muy alto</td></tr><tr><td>M5</td><td>Número de registros adversos en el reporte de crédito es muy alto </td></tr><tr><td>N3</td><td>Número de préstamos personales activos en el reporte de crédito es muy alto</td></tr><tr><td>P6</td><td>Proporción del saldo respecto al límite en cuenta(s) revolvente(s) es muy alto</td></tr><tr><td>P9</td><td>Proporción del saldo de Préstamo(s) respecto al Monto de los Préstamo(s) es muy alto</td></tr><tr><td>Q0</td><td>Proporción del saldo revolvente respecto al saldo total es muy alto</td></tr><tr><td>R0</td><td>Pocas cuentas con pagos al corriente</td></tr><tr><td>R2</td><td>Muy pocas cuentas con información de pago reciente en el reporte de crédito</td></tr><tr><td>R3</td><td>Muy pocas cuentas activas en el reporte de crédito</td></tr><tr><td>T0</td><td>Muchas cuentas aperturadas recientemente en el reporte de crédito</td></tr><tr><td>T1</td><td>Muchas cuentas con saldo en el reporte de crédito</td></tr><tr><td>T4</td><td>Muchos préstamos en el reporte de crédito</td></tr><tr><td>U7</td><td>Muchas cuentas aperturadas a pagos fijos recientemente en el reporte de crédito</td></tr><tr><td>V3</td><td>Muchas cuentas revolventes en el reporte de crédito</td></tr><tr><td>Z3</td><td>Registros negativos en el reporte de crédito.</td></tr></tbody></table>")
	public ReasonCode3Enum getReasonCode3() {
		return reasonCode3;
	}

	public void setReasonCode3(ReasonCode3Enum reasonCode3) {
		this.reasonCode3 = reasonCode3;
	}

	public Score reasonCode4(ReasonCode4Enum reasonCode4) {
		this.reasonCode4 = reasonCode4;
		return this;
	}

	@ApiModelProperty(value = "<table><thead><tr><th>Clave</th><th>Descripción</th></tr></thead><tbody><tr><td>SC</td><td>No se calculó el Score por servicio temporalmente no disponible o tiempo en espera demasiado largo</td></tr><tr><td>C1</td><td>No existe el expediente en la base</td></tr><tr><td>C2</td><td>El expediente encontrado solo tiene datos demográficos</td></tr><tr><td>C4</td><td>El expediente encontrado no tiene cuentas activas en los últimos 24 meses o cuentas válidas</td></tr><tr><td>C6</td><td>El expediente sólo tiene registros de Morosidad Comercial, Protestos, Omisos o Deudores</td></tr><tr><td>C7</td><td>Tipo de persona no Natural</td></tr><tr><td>A1</td><td>Últimas cuentas reportadas se encuentran en morosidad</td></tr><tr><td>A3</td><td>El monto de deuda en cuenta(s) es demasiado alto </td></tr><tr><td>D2</td><td>Existe morosidad en cuenta(s) en el reporte de crédito</td></tr><tr><td>D8</td><td>Existen cuenta(s) en morosidad grave o castigo en el reporte de crédito</td></tr><tr><td>E0</td><td>El solicitante tiene poca experiencia crediticia</td></tr><tr><td>E1</td><td>Falta información demográfica sobre el solicitante de crédito.</td></tr><tr><td>E4</td><td>Falta de información reciente de la(s) cuenta(s) en el reporte de crédito</td></tr><tr><td>F1</td><td>Falta de nuevos registros de crédito en el reporte de crédito</td></tr><tr><td>F7</td><td>Falta de información reciente de préstamos en el reporte de crédito</td></tr><tr><td>F8</td><td>Falta de información reciente de préstamo(s) hipotecarios.</td></tr><tr><td>G1</td><td>Falta de información reciente de cuentas revolventes en el reporte de crédito</td></tr><tr><td>G2</td><td>Falta de información de préstamos hipotecarios en el reporte de crédito</td></tr><tr><td>J0</td><td>La antigüedad de las cuentas es corta.</td></tr><tr><td>K0</td><td>Tiempo transcurrido desde la morosidad en el reporte de crédito es demasiado reciente </td></tr><tr><td>K2</td><td>Tiempo transcurrido desde la apertura de cuenta más reciente es demasiado corto</td></tr><tr><td>M1</td><td>El número de cuentas con morosidad en el reporte de crédito es muy alto</td></tr><tr><td>M5</td><td>Número de registros adversos en el reporte de crédito es muy alto </td></tr><tr><td>N3</td><td>Número de préstamos personales activos en el reporte de crédito es muy alto</td></tr><tr><td>P6</td><td>Proporción del saldo respecto al límite en cuenta(s) revolvente(s) es muy alto</td></tr><tr><td>P9</td><td>Proporción del saldo de Préstamo(s) respecto al Monto de los Préstamo(s) es muy alto</td></tr><tr><td>Q0</td><td>Proporción del saldo revolvente respecto al saldo total es muy alto</td></tr><tr><td>R0</td><td>Pocas cuentas con pagos al corriente</td></tr><tr><td>R2</td><td>Muy pocas cuentas con información de pago reciente en el reporte de crédito</td></tr><tr><td>R3</td><td>Muy pocas cuentas activas en el reporte de crédito</td></tr><tr><td>T0</td><td>Muchas cuentas aperturadas recientemente en el reporte de crédito</td></tr><tr><td>T1</td><td>Muchas cuentas con saldo en el reporte de crédito</td></tr><tr><td>T4</td><td>Muchos préstamos en el reporte de crédito</td></tr><tr><td>U7</td><td>Muchas cuentas aperturadas a pagos fijos recientemente en el reporte de crédito</td></tr><tr><td>V3</td><td>Muchas cuentas revolventes en el reporte de crédito</td></tr><tr><td>Z3</td><td>Registros negativos en el reporte de crédito.</td></tr></tbody></table>")
	public ReasonCode4Enum getReasonCode4() {
		return reasonCode4;
	}

	public void setReasonCode4(ReasonCode4Enum reasonCode4) {
		this.reasonCode4 = reasonCode4;
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
				&& Objects.equals(this.nombreScore, score.nombreScore) && Objects.equals(this.score, score.score)
				&& Objects.equals(this.reasonCode1, score.reasonCode1)
				&& Objects.equals(this.reasonCode2, score.reasonCode2)
				&& Objects.equals(this.reasonCode3, score.reasonCode3)
				&& Objects.equals(this.reasonCode4, score.reasonCode4);
	}

	@Override
	public int hashCode() {
		return Objects.hash(folioConsultaOtorgante, numConsulta, nombreScore, score, reasonCode1, reasonCode2,
				reasonCode3, reasonCode4);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Score {\n");

		sb.append("    folioConsultaOtorgante: ").append(toIndentedString(folioConsultaOtorgante)).append("\n");
		sb.append("    numConsulta: ").append(toIndentedString(numConsulta)).append("\n");
		sb.append("    nombreScore: ").append(toIndentedString(nombreScore)).append("\n");
		sb.append("    score: ").append(toIndentedString(score)).append("\n");
		sb.append("    reasonCode1: ").append(toIndentedString(reasonCode1)).append("\n");
		sb.append("    reasonCode2: ").append(toIndentedString(reasonCode2)).append("\n");
		sb.append("    reasonCode3: ").append(toIndentedString(reasonCode3)).append("\n");
		sb.append("    reasonCode4: ").append(toIndentedString(reasonCode4)).append("\n");
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
