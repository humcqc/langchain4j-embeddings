package dev.langchain4j.model.embedding;

public class BGE_SMALL_EN_EmbeddingModel extends AbstractInProcessEmbeddingModel {

    private static final OnnxBertBiEncoder MODEL = loadFromJar(
            "bge-small-en.onnx",
            "bert-vocabulary-en.txt",
            PoolingMode.CLS
    );

    @Override
    protected OnnxBertBiEncoder model() {
        return MODEL;
    }
}