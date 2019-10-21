package io.apihub.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

public class DatosConsulta {
	
	@SerializedName("numeroDocumento")
	private String numeroDocumento = null;

	@JsonAdapter(TipoDocumentoEnum.Adapter.class)
	public enum TipoDocumentoEnum {
		_1("1"),

		_2("2"),

		_10("10");
		private String value;

		TipoDocumentoEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static TipoDocumentoEnum fromValue(String text) {
			for (TipoDocumentoEnum b : TipoDocumentoEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		public static class Adapter extends TypeAdapter<TipoDocumentoEnum> {
			@Override
			public void write(final JsonWriter jsonWriter, final TipoDocumentoEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public TipoDocumentoEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return TipoDocumentoEnum.fromValue(String.valueOf(value));
			}
		}
	}

	@SerializedName("tipoDocumento")
	private TipoDocumentoEnum tipoDocumento = null;
	@SerializedName("folioConsultaOtorgante")
	private String folioConsultaOtorgante = null;

	public DatosConsulta numeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
		return this;
	}

	@ApiModelProperty(example = "67544489", required = true, value = "Numero de documento de la persona que se quiera evaluar.")
	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public DatosConsulta tipoDocumento(TipoDocumentoEnum tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
		return this;
	}

	@ApiModelProperty(example = "1", required = true, value = "<table><thead><tr>Tipo de documento que corresponde al número de documento que se quiere consultar</tr><tr><th>Tipo documento</th><th>Descripción</th></tr></thead><tbody><tr><td>1</td><td>DNI</td></tr><tr><td>2</td><td>Carnet de extranjería</td></tr><tr><td>10</td><td>RUC</td></tr></tbody></table>")
	public TipoDocumentoEnum getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumentoEnum tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public DatosConsulta folioConsultaOtorgante(String folioConsultaOtorgante) {
		this.folioConsultaOtorgante = folioConsultaOtorgante;
		return this;
	}

	@ApiModelProperty(example = "123456789", value = "<tr>Es el identificador de la consulta realizada por parte del otorgante. Este folio se regresa de manera integra en el elemento respuesta.</tr></br>")
	public String getFolioConsultaOtorgante() {
		return folioConsultaOtorgante;
	}

	public void setFolioConsultaOtorgante(String folioConsultaOtorgante) {
		this.folioConsultaOtorgante = folioConsultaOtorgante;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DatosConsulta datosConsulta = (DatosConsulta) o;
		return Objects.equals(this.numeroDocumento, datosConsulta.numeroDocumento)
				&& Objects.equals(this.tipoDocumento, datosConsulta.tipoDocumento)
				&& Objects.equals(this.folioConsultaOtorgante, datosConsulta.folioConsultaOtorgante);
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroDocumento, tipoDocumento, folioConsultaOtorgante);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DatosConsulta {\n");

		sb.append("    numeroDocumento: ").append(toIndentedString(numeroDocumento)).append("\n");
		sb.append("    tipoDocumento: ").append(toIndentedString(tipoDocumento)).append("\n");
		sb.append("    folioConsultaOtorgante: ").append(toIndentedString(folioConsultaOtorgante)).append("\n");
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
