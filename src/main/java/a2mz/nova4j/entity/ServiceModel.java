package a2mz.nova4j.entity;

import a2mz.nova4j.entity.common.CalledMethod;
import a2mz.nova4j.entity.common.ModelName;
import a2mz.nova4j.entity.common.MethodProperties;
import lombok.Getter;

/**
 * Created by Morozov Oleksandr on 29.11.2016.
 * 414D
 */
@Getter

public class ServiceModel {
	private final String apiKey;
	private ModelName modelName;
	private CalledMethod calledMethod;
	private MethodProperties methodProperties;

	private ServiceModel(String apiKey) {
		this.apiKey = apiKey;
	}

	public static ServiceModel create(String apiKey, ModelName model, CalledMethod method) {
		return new ServiceModel(apiKey)
				.setModelName(model)
				.setCalledMethod(method);
	}

	public String getModelName() {
		return modelName.getVal();
	}

	private ServiceModel setModelName(ModelName modelName) {
		this.modelName = modelName;
		return this;
	}

	public String getCalledMethod() {
		return calledMethod.getVal();
	}

	private ServiceModel setCalledMethod(CalledMethod calledMethod) {
		this.calledMethod = calledMethod;
		return this;
	}

	public ServiceModel setMethodProperties(MethodProperties methodProperties) {
		this.methodProperties = methodProperties;
		return this;
	}
}
