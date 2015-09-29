package org.apache.lucene.search.similarities;


public class ConstantTfSimilarity extends DefaultSimilarity {
    @Override
    public float tf(float freq) {
        return 1.0f;
    }
}
