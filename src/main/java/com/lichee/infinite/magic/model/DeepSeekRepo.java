package com.lichee.infinite.magic.model;

import java.util.List;


public class DeepSeekRepo {

    private String id;
    private String object;
    private int created;
    private String model;
    private String systemFingerprint;
    private List<ChoicesDto> choices;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSystemFingerprint() {
        return systemFingerprint;
    }

    public void setSystemFingerprint(String systemFingerprint) {
        this.systemFingerprint = systemFingerprint;
    }

    public List<ChoicesDto> getChoices() {
        return choices;
    }

    public void setChoices(List<ChoicesDto> choices) {
        this.choices = choices;
    }

    public static class ChoicesDto {
        private int index;
        private DeltaDto delta;
        private Object logprobs;
        private Object finishReason;

        public static class DeltaDto {
            private String role;
            private String content;
            private String reasoning_content;

            public String getRole() {
                return role;
            }

            public void setRole(String role) {
                this.role = role;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getReasoning_content() {
                return reasoning_content;
            }

            public void setReasoning_content(String reasoning_content) {
                this.reasoning_content = reasoning_content;
            }
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public DeltaDto getDelta() {
            return delta;
        }

        public void setDelta(DeltaDto delta) {
            this.delta = delta;
        }

        public Object getLogprobs() {
            return logprobs;
        }

        public void setLogprobs(Object logprobs) {
            this.logprobs = logprobs;
        }

        public Object getFinishReason() {
            return finishReason;
        }

        public void setFinishReason(Object finishReason) {
            this.finishReason = finishReason;
        }
    }
}
