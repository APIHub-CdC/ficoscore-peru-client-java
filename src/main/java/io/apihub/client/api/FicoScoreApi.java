package io.apihub.client.api;

import io.apihub.client.ApiClient;
import io.apihub.client.ApiException;
import io.apihub.client.ApiResponse;
import io.apihub.client.Configuration;
import io.apihub.client.Pair;
import io.apihub.client.ProgressRequestBody;
import io.apihub.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.apihub.client.model.DatosConsulta;
import io.apihub.client.model.Score;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FicoScoreApi {
	private ApiClient apiClient;

	public FicoScoreApi() {
		this(Configuration.getDefaultApiClient());
	}

	public FicoScoreApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public okhttp3.Call ficoScoreCall(String xApiKey, String username, String password,
			DatosConsulta request, final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = request;
		String localVarPath = "/";
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		if (xApiKey != null)
			localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
		if (username != null)
			localVarHeaderParams.put("username", apiClient.parameterToString(username));
		if (password != null)
			localVarHeaderParams.put("password", apiClient.parameterToString(password));
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = { "application/json" };
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null)
			localVarHeaderParams.put("Accept", localVarAccept);
		final String[] localVarContentTypes = { "application/json" };
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);
		if (progressListener != null) {
			apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
				@Override
				public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
					okhttp3.Response originalResponse = chain.proceed(chain.request());
					return originalResponse.newBuilder()
							.body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
				}
			});
		}
		String[] localVarAuthNames = new String[] {};
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
				localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	private okhttp3.Call ficoScoreValidateBeforeCall(String xApiKey, String username,
			String password, DatosConsulta request, final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		if (xApiKey == null) {
			throw new ApiException("Missing the required parameter 'xApiKey' when calling ficoScore(Async)");
		}
		if (username == null) {
			throw new ApiException("Missing the required parameter 'username' when calling ficoScore(Async)");
		}
		if (password == null) {
			throw new ApiException("Missing the required parameter 'password' when calling ficoScore(Async)");
		}
		if (request == null) {
			throw new ApiException("Missing the required parameter 'request' when calling ficoScore(Async)");
		}

		okhttp3.Call call = ficoScoreCall(xApiKey, username, password, request, progressListener,
				progressRequestListener);
		return call;
	}

	public Score ficoScore(String xApiKey, String username, String password, DatosConsulta request)
			throws ApiException {
		ApiResponse<Score> resp = ficoScoreWithHttpInfo(xApiKey, username, password, request);
		return resp.getData();
	}

	public ApiResponse<Score> ficoScoreWithHttpInfo(String xApiKey, String username, String password,
			DatosConsulta request) throws ApiException {
		okhttp3.Call call = ficoScoreValidateBeforeCall(xApiKey, username, password, request, null, null);
		Type localVarReturnType = new TypeToken<Score>() {
		}.getType();
		return apiClient.execute(call, localVarReturnType);
	}
}
