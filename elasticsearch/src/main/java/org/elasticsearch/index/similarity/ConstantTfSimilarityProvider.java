package org.elasticsearch.index.similarity;

import org.apache.lucene.search.similarities.ConstantTfSimilarity;
import org.apache.lucene.search.similarities.Similarity;
import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.inject.assistedinject.Assisted;
import org.elasticsearch.common.settings.Settings;


public class ConstantTfSimilarityProvider extends AbstractSimilarityProvider {
	private ConstantTfSimilarity similarity;

	@Inject
	public ConstantTfSimilarityProvider(@Assisted String name, 
                                        @Assisted Settings settings) {
		super(name);
		this.similarity = new ConstantTfSimilarity();
	}

    @Override
	public ConstantTfSimilarity get() {
		return similarity;
	}
}
