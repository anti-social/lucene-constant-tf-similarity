package org.elasticsearch.plugin.similarity;

import org.elasticsearch.common.inject.Module;
import org.elasticsearch.index.similarity.ConstantTfSimilarityProvider;
import org.elasticsearch.index.similarity.SimilarityModule;
import org.elasticsearch.plugins.AbstractPlugin;


public class ConstantTfSimilarityPlugin extends AbstractPlugin {
    @Override
    public String name() {
        return "constant-tf-similarity-plugin";
    }

    @Override
    public String description() {
        return "Constant Tf Similarity Plugin";
    }

    @Override
    public void processModule(Module module) {
        if (module instanceof SimilarityModule) {
        	SimilarityModule similarityModule = (SimilarityModule) module;
        	similarityModule.addSimilarity("constant_tf_similarity", ConstantTfSimilarityProvider.class);
        }
    }
}
