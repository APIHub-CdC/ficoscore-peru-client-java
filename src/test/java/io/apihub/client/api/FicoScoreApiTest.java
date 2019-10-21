package io.apihub.client.api;

import io.apihub.client.ApiClient;
import io.apihub.client.ApiException;
import io.apihub.client.model.DatosConsulta;
import io.apihub.client.model.DatosConsulta.TipoDocumentoEnum;
import io.apihub.client.model.Score;
import io.apihub.interceptor.SignerInterceptor;
import okhttp3.OkHttpClient;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;

public class FicoScoreApiTest {
	private final FicoScoreApi api = new FicoScoreApi();
	
	@Before()
	public void setUp() {
		ApiClient apiClient = api.getApiClient();
		apiClient.setBasePath("the_url");
		
		OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
				.readTimeout(30, TimeUnit.SECONDS)
				.addInterceptor(new SignerInterceptor())
				.build();
		apiClient.setHttpClient(okHttpClient);
	}

	@Test
	public void ficoScoreTest() throws ApiException {
		String xApiKey = "your_api_key";
		String username = "your_username";
		String password = "your_password";
		
		DatosConsulta request = new DatosConsulta();
		request.setNumeroDocumento("xxxxx");
		request.setTipoDocumento(TipoDocumentoEnum._1);
		request.setFolioConsultaOtorgante(null);
		
		try {
			Score response = api.ficoScore(xApiKey, username, password, request);
			Assert.assertTrue(response != null);
		} catch (ApiException e) {
			System.out.println(e);
		}
		
	}

}
